package com.adnj.buddysearchshareutils.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Reviews implements ValueCodeScoreValue {
    FAST_ANSWER("응답이 매우 빨랐어요.", 101,0.2f),
    CONVENIENT_PLACE("제가 원하는 장소로 약속을 잡아주셨어요.", 102,0.1f),
    FAST_ARRIVE("저보다 빨리 와서 기다려 주셨어요.", 103,0.2f),
    GOOD_MANNERS("친절하고 매너가 좋아요", 104,0.25f),
    COMMUNICATED_WELL("소통이 원활했어요.", 105,0.25f),

    // 보통
    GOOD_ANSWER("응답을 잘 해주셨어요.", 201,0f),
    GOOD_PLACE("합리적인 약속 장소 였어요.", 202,0f),
    GOOD_ARRIVE("시간약속을 잘 지켜 주셨어요.", 203,0.f),
    SOSO_MANNERS("괜찮은 매너였어요.", 204,0f),
    NO_TRASH_TALK("필요 없는 이야기를 하지 않았어요.  ", 205,0f),


    // 부정
    DO_NOT_MEET_AGAIN("다음에 만나지 않기", 301,-0.1f),
    SLOW_ANSWER("응답이 매우 느렸어요.", 302,-0.05f),
    NO_SHOW("약속 장소에 나타나지 않았어요.", 303,-0.1f),
    BAD_TIME_PROMISE("시간 약속을 지키지 않았어요.", 304,-0.1f),
    BAD_MANNERS("매너가 좋지 않았어요.", 305,-0.1f),
    BAD_COMMUNICATION("소통이 잘 이루어 지지 않았어요.", 306,-0.1f),
    BAD_WORDING("부적절한 언행과 행동을 사용했어요.", 307,-0.1f);

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

    public static Reviews fromCode(int code) {
        for (Reviews status : Reviews.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

}
