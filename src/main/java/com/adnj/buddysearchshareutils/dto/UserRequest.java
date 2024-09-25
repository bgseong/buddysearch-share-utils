package com.adnj.buddysearchshareutils.dto;

import com.adnj.buddysearchshareutils.enums.AgreementType;
import com.adnj.buddysearchshareutils.enums.ApplyType;
import com.adnj.buddysearchshareutils.enums.FreeDivingLevel;
import com.adnj.buddysearchshareutils.enums.SportType;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;


public class UserRequest {


    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class UpdateSimpleProfile {
        private String nickName;
        private List<LevelDto> levels;
        private String region;
        private List<SportType> sportType;
        private Boolean isBlind;
        private String introduction;
        private MultipartFile file;
        private List<LicenseCreateDto> license;

        @Getter
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        @Setter
        public static class LevelDto{
            private SportType sportType;
            private FreeDivingLevel level;

        }

    }
    @Getter
    @Setter
    public static class LicenseCreateDto {
        private String licenseType;
        private MultipartFile file;
        private SportType sportType;
    }

    @Getter
    @Setter
    public static class LicenseUpdateDto {
        private Long licenseId;
        private MultipartFile file;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class UpdateDetailProfile {
        private String detailIntroduction;
        private List<MultipartFile> file;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class CreateInstructor {
        private UUID userId;
        private String association;
        private SportType sportType;
        private List<String> personalHistory;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class RefuseInstructor{
        private String refuseReason;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class CreateApplyInstructor {
        private SportType sportType;
        private ApplyType applyType;
        private List<MultipartFile> file;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class UpdateInstructor {
        private List<MultipartFile> files;
        private String detailAboutMe;
        private List<String> personalHistory;
        private Boolean isBlind;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class UpdateInstructorAdmin {
        private List<MultipartFile> profileImg;
        private String detailAboutMe;
        private List<String> personalHistory;
    }



    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class NotificationConnect{
        private String model;

        private String osType;

        private String os_version;

        private String fcmToken;

        private String identifyId;
    }
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class AgreementRequest{
        private UUID userId;

        private List<Agreements> agreements;

        @Setter
        @Getter
        @AllArgsConstructor
        @NoArgsConstructor
        public static class Agreements{
            private AgreementType agreementType;
            private Boolean isAgree;
        }
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Setter
    public static class AgreementChangeRequest{
        private UUID userId;

        private AgreementType agreements;
    }
}
