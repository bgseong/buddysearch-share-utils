package com.adnj.buddysearchshareutils.enums;


import com.fasterxml.jackson.annotation.JsonValue;

public enum ApplyStatus implements ValueCode{
    WAIT("심사중", 1),
    INPROCESSING("처리중", 2),
    COMPLETE("등록완료",3),
    CANCEL("심사취소", 4),
    REFUSE("신청반려",5);

    @JsonValue
    private String value;
    private Integer code;

    ApplyStatus(String value, Integer code) {
        this.value = value;
        this.code = code;
    }
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
