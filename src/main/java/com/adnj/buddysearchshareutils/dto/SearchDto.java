package com.adnj.buddysearchshareutils.dto;


import com.adnj.buddysearchshareutils.enums.SportType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class SearchDto {

    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProfileDto {
        private UUID userId;

        public Long instructorProfileId;

        private String imgUrl;

        private String name;

        private String nickName;

        private Integer sex;

        private Float score;

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

        private Long createAt;

        private Long updateAt;

        private Boolean isBlind;

        public ProfileDto(UUID userId, String imgUrl, String name, String nickName, Integer sex, Integer age, Float score, String birth, String role, String region, List<SportType> sportType, List<UserResponse.LevelDto> level, String introduction, List<String> detailImgUrl, String detailIntroduction, Boolean isCardUse, Long createAt, Long updateAt, Boolean isBlind ) {
            this.userId = userId;
            this.imgUrl = imgUrl;
            this.name = name;
            this.score = score;
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
            this.level = level;
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
    public static class InstructorProfileDto {
        private UUID userId;

        private Long instructorId;

        private String name;

        private String nickName;

        private List<String> region;

        private String introduction;

        private Integer sex;

        private Integer age;

        private SportType sportType;

        private List<String> detailImgUrl;

        private String detailIntroduction;

        private List<String> personalHistory;

        public InstructorProfileDto(UUID userId, Long instructorId, String name, String nickName, String region, String introduction, Integer sex, Integer age, SportType sportType, List<String> detailImgUrl, String detailIntroduction, List<String> personalHistory) {
            this.userId = userId;
            this.instructorId = instructorId;
            this.name = name;
            this.nickName = nickName;
            if(region != null){
                this.region = Arrays.stream(region.split(","))
                        .map(String::trim)
                        .collect(Collectors.toList());
            }
            this.introduction = introduction;
            this.sex = sex;
            this.age = age;
            this.sportType = sportType;
            this.detailImgUrl = detailImgUrl;
            this.detailIntroduction = detailIntroduction;
            this.personalHistory = personalHistory;
        }
    }

}
