package com.adnj.buddysearchshareutils.enums;

public enum LoginType {
    DEFAULT(1,"Default"),
    KAKAO(2,"Kakao"),
    NAVER(3,"Naver"),
    GOOGLE(4,"Google"),
    APPLE(5,"Apple")

    ;

    private final int code;
    private final String description;

    // 생성자
    LoginType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    // 코드 값을 반환하는 메서드
    public int getCode() {
        return code;
    }

    // 설명을 반환하는 메서드
    public String getDescription() {
        return description;
    }

    // 코드 값을 사용해 Status 객체를 찾는 메서드
    public static LoginType fromCode(int code) {
        for (LoginType status : LoginType.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    // 설명을 사용해 Status 객체를 찾는 메서드
    public static LoginType fromDescription(String description) {
        for (LoginType status : LoginType.values()) {
            if (status.getDescription().equalsIgnoreCase(description)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }
}
