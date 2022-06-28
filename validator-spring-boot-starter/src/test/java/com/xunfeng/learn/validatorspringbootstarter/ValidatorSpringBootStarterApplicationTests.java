package com.xunfeng.learn.validatorspringbootstarter;

import com.xunfeng.learn.validatorspringbootstarter.validator.CheckChain;
import com.xunfeng.learn.validatorspringbootstarter.validator.CheckContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidatorSpringBootStarterApplicationTests {

    @Autowired
    private CheckChain<CheckContent> checkChain;

    @Test
    void contextLoads() {

    }

}
