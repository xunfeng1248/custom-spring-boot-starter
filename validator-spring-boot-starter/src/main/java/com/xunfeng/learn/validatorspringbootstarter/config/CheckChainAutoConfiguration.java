package com.xunfeng.learn.validatorspringbootstarter.config;

import com.xunfeng.learn.validatorspringbootstarter.validator.CheckChain;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(CheckChainAutoConfiguration.class)
public class CheckChainAutoConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public CheckChain checkChain() {
        return new CheckChain();
    }
}
