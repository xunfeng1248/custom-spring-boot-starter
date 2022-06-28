package com.xunfeng.learn.validatorspringbootstarter.validator;

public interface Check<Input> {

    /**
     * 校验方法
     *
     * @param input
     * @return
     */
    Boolean check(Input input);

    /**
     * 校验器的排序
     *
     * @return
     */
    int order();

    /**
     * 校验器的分组
     *
     * @return
     */
    String group();
}
