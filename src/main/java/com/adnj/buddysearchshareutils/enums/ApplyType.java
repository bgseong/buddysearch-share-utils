package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplyType implements ValueCode {
    NEW("신규등록", 1),
    RENEWAL("갱신신청", 2);

    @JsonValue
    private String value;
    private Integer code;

    ApplyType(String value, Integer code) {
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

    public static ApplyType fromCode(@JsonProperty("applyType") int code) {
        for (ApplyType status : ApplyType.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }


}
