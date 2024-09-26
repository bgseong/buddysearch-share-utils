package com.adnj.buddysearchshareutils.dto;

import com.adnj.buddysearchshareutils.enums.SportType;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {
    private String refreshToken;
    private String accessToken;

    private UserInfo data;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class UserInfo{
        private UUID userId;

        private String email;

        private String socialType;

        private ProfileDto profile;

        private SubscriptionDto subscription;

        private List<InstructorProfileDto> instructors;

        private List<UserResponse.LicenseDto> license;

        private List<UserResponse.AgreementDto> agreements;


        @Getter
        @Setter
        public static class ProfileDto{
            private String imgUrl;

            private String name;

            private String nickName;

            private Integer sex;
            
            private Integer age;

            private String birth;

            private String role;

            private List<String> region;

            private List<SportType> sportType;

            private List<UserResponse.LevelDto> level;

            private String introduction;
            
            private List<String> detailImgUrl;

            private String detailIntroduction;

            private Boolean isCardUse;

            private Boolean isInstructor;

            private Long createAt;

            private Long updateAt;

            private Boolean isBlind;
            public ProfileDto(String imgUrl, String name, String nickName, Integer sex, Integer age, String birth, String role, String region, List<SportType> sportType, List<UserResponse.LevelDto> level, String introduction, List<String> detailImgUrl, String detailIntroduction, Boolean isCardUse, Long createAt, Long updateAt, Boolean isBlind) {
                this.imgUrl = imgUrl;
                this.name = name;
                this.nickName = nickName;
                this.sex = sex;
                this.age = age;
                this.birth = birth;
                this.role = role;
                if(region != null){
                    this.region = Arrays.stream(region.split(","))
                            .map(String::trim)
                            .collect(Collectors.toList());
                }
                if(sportType != null){
                    this.sportType = sportType;
                }
                if(level != null){
                    this.level = level;
                }
                this.introduction = introduction;
                this.detailImgUrl = detailImgUrl;
                this.detailIntroduction = detailIntroduction;
                this.isCardUse = isCardUse;
                this.createAt = createAt;
                this.updateAt = updateAt;
                this.isBlind = isBlind;
            }
        }

        @Getter
        @Setter
        @JsonInclude(JsonInclude.Include.NON_NULL)
        public static class SubscriptionDto{
            private String subscriptionPlan;

            private Long purchaseDate;

            private Integer count;
        }

        @Getter
        @Setter
        public static class InstructorProfileDto{
            private Long instructorProfileId;

            private SportType sportType;

            private List<String> detailImgUrl;

            private String detailIntroduction;

            private List<String> personalHistory;

            private Long createAt;

            private Long updateAt;

            private Boolean isBlind;
        }
    }



}
