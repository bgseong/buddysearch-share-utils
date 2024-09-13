package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FreeDivingLevel implements ValueCode {
    NONE("레벨없음",0),
    LEVEL1("LEVEL1",1),
    LEVEL2("LEVEL2",2),
    LEVEL3("LEVEL3",3),
    MASTER("MASTER",4);

    @JsonValue
    private String value;
    private Integer code;

    // 생성자


    FreeDivingLevel(String value, Integer code) {
        this.value = value;
        this.code = code;
    }

    // 코드 값을 반환하는 메서드
    public Integer getCode() {
        return code;
    }

    // 설명을 반환하는 메서드
    public String getValue() {
        return value;
    }

    // 코드 값을 사용해 Status 객체를 찾는 메서드
    public static FreeDivingLevel fromCode(Integer code) {
        if(code == null){
            return null;
        }
        for (FreeDivingLevel status : FreeDivingLevel.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    // 설명을 사용해 Status 객체를 찾는 메서드
    @JsonCreator
    public static FreeDivingLevel fromValue(String description) {
        for (FreeDivingLevel status : FreeDivingLevel.values()) {
            if (status.getValue().equalsIgnoreCase(description)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }
}
