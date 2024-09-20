package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AgreementType implements ValueCode{
    PERSONALINFORMATION("개인정보 처리방침", 1),
    TERMS_AND_CONDITIONS("서비스 이용 약관", 2),
    CONSENT_TO_USE_MARKETING("마케팅 활용 동의",3);

    @JsonValue
    private String value;
    private Integer code;

    AgreementType(String value, Integer code) {
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
