package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserStatus implements ValueCode{
    NORMAL("일반", 1),
    BLOCK("차단", 2),
    DELETED("탈퇴",3);

    @JsonValue
    private String value;
    private Integer code;

    UserStatus(String value, Integer code) {
        this.value = value;
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getValue() {
        return value;
    }
}
