package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BroadType implements ValueCode{
    ENVENT("이벤트", 101),
    NOTICE("공지사항", 102),
    INTRODUCE("풀장소개", 103),

    FREEBOARD("자유게시판",201),
    REVIEW("후기게시판",202);



    @JsonValue
    private String value;
    private Integer code;

    BroadType(String value, Integer code) {
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

    public static BroadType fromCode(@JsonProperty("applyType") int code) {
        for (BroadType status : BroadType.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}
