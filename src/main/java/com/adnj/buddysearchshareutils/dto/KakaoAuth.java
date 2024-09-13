package com.adnj.buddysearchshareutils.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class KakaoAuth {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class request{
        public String grant_type;
        public String client_id;
        public String redirect_uri;
        public String code;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class KakaoInfo{
        public String id;
        public KakaoAccount kakao_account;

        @Getter
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder
        public static class KakaoAccount{
            public Profile profile;
            public String email;

            @Getter
            @NoArgsConstructor
            @AllArgsConstructor
            @Builder
            public static class Profile{
                public String nickname;
                public Boolean is_default_image;
                public String thumbnail_image_url;
                public String profile_image_url;
            }
        }


    }

}
