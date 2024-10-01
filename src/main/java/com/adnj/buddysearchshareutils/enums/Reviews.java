package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Reviews implements ValueCodeScoreValue {
    MEET_AGAIN_NEXT_TIME("다음에 또 만나요!", 101,2f),
    GOOD_MANNERS("매너가 좋아요.", 102,1f),
    ENJOYED_DIVING("다이빙이 즐거웠어요.", 103,1f),
    MADE_COMFORTABLE("편하게 해주셨어요.", 104,0.5f),
    COMMUNICATED_WELL("소통이 원활했어요.", 105,0.5f),
    KEPT_TIME_PROMISE("시간약속을 잘 지켜요.", 106,0.5f),
    MANY_THINGS_TO_LEARN("배울점이 많아요.", 107,1f),

    // 보통
    MEET_AGAIN_NEXT_TIME_NORMAL("다음에 또 만나요!", 201,0f),
    IT_WAS_GOOD("좋았어요.", 202,0f),
    HAD_FUN("재밌었어요.", 203,0f),

    // 부정
    DO_NOT_MEET_AGAIN("다음에 만나지 않기", 301,-2f),
    UNCOMFORTABLE_COMMUNICATION("불편한 소통", 302,-1f),
    DID_NOT_KEEP_TIME_PROMISE("시간 약속 미준수", 303,-0.5f),
    BAD_MANNERS("비매너", 304,-2f);

    @JsonValue
    private String value;
    private Integer code;
    private Float scoreValue;


    Reviews(String value, Integer code, Float scoreValue) {
        this.value = value;
        this.code = code;
        this.scoreValue = scoreValue;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public Float getScoreValue() {
        return scoreValue;
    }

}
