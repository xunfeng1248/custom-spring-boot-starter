package com.xunfeng.learn.validatorspringbootstarter.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class CheckChain<Input> {

    @Autowired
    private ApplicationContext applicationContext;

    public void check(Input input, String group) {
        Map<String, Check> name2AutoCheck = applicationContext.getBeansOfType(Check.class);
        List<Check> checks = name2AutoCheck.values().stream().filter(c -> group.equals(c.group())).sorted(Comparator.comparingInt(Check::order)).collect(Collectors.toList());
        for (Check check : checks) {
            Boolean checkResult = check.check(input);
            if (Objects.nonNull(checkResult) && !checkResult) {
                break;
            }
        }
    }
}
