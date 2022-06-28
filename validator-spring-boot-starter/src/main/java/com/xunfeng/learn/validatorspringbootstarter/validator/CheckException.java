package com.xunfeng.learn.validatorspringbootstarter.validator;

/**
 * 校验异常
 */
public class CheckException extends RuntimeException {

    public CheckException() {
        super();
    }

    public CheckException(String message) {
        super(message);
    }
}
