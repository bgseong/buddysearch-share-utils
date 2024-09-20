package com.adnj.buddysearchshareutils.dto;

import com.adnj.buddysearchshareutils.enums.*;
import lombok.*;

import java.util.List;

public class UserResponse {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class GetInstructorApply {
        private Long applyId;

        private SportType sportType;

        private String reason;

        private ApplyType applyType;

        private ApplyStatus status;

        private List<String> imgUrls;

        private Long createAt;

        private Long updateAt;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class GetInstructor {
        private Long instructorProfileId;

        private Integer sportType;

        private List<String> detailImgUrl;

        private String detailIntroduction;

        private String association;

        private List<String> personalHistory;

        private Boolean isBlind;

    }
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class LevelDto{
        private SportType sportType;
        private FreeDivingLevel level;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class LicenseDto{
        private Long licenseId;
        private String imgUrl;
        private SportType sportType;
        private String licenseType;

    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class AgreementDto{
        private AgreementType agreement;

        private Boolean isAgree;

        private Long createAt;

        private Long updateAt;

    }

}
