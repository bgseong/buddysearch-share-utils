package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonValue;


public enum SportType implements ValueCode {


//    @JsonProperty("프리다이빙")
    FREEDIVING("프리다이빙",1),
  //  @JsonProperty("스쿠버다이빙")
    SCUBADIVING("스쿠버다이빙",2),
 //   @JsonProperty("해루질스킨")
    HARUJILSKIN( "해루질 스킨",3),
 //   @JsonProperty("머메이드")
    MERMAID("머메이드",4);

    @JsonValue
    private String value;
    private Integer code;

    // 생성자


    SportType(String value, Integer code) {
        this.value = value;
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public Integer getCode() {
        return code;
    }

    // 코드 값을 사용해 Status 객체를 찾는 메서드

    public static SportType fromCode(int code) {
        for (SportType status : SportType.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    // 설명을 사용해 Status 객체를 찾는 메서드

    public static SportType fromValue(String description) {
        for (SportType status : SportType.values()) {
            if (status.getValue().equals(description)) {
                System.out.println(status);
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }
}
