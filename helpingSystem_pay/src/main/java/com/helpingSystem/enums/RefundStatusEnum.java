package com.helpingSystem.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 退款状态枚举
 *
 * @author itheima
 * @version 1.0
 */
public enum RefundStatusEnum {

    SENDING(1, "退款中"),
    SUCCESS(2, "成功"),
    FAIL(3, "失败");

    @JsonValue
    private Integer code;
    private String value;

    RefundStatusEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    public Integer getCode() {
        return this.code;
    }

    public String getValue() {
        return this.value;
    }
}
