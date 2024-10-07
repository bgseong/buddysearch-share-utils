package com.adnj.buddysearchshareutils.dto;


import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


public class AuthRequest {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class login{
        @NotEmpty
        @Email
        private String email;

        @Nullable
        private String password;

        @NotEmpty
        private String type;

        private String name;
        private Integer sex;
        private String birth;
        private String nickName;


    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class register{
        @Email
        @NotEmpty
        public String email;

        @NotEmpty
        public String password;

        @NotEmpty
        public String name;

        @NotNull
        public Integer sex;

        @NotEmpty
        public String birth;

        @NotEmpty
        public String nickName;

        public String code;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class socialLast{
        @NotEmpty
        public String name;

        @NotEmpty
        public Integer sex;

        @NotEmpty
        public String nickName;

        @NotEmpty
        public String birth;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class emailCertification{
        @NotEmpty
        public String code;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class changePassword{
        @Email
        @NotEmpty
        public String email;

        @NotEmpty
        public String newPassword;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class checkPassword{
        @NotEmpty
        public UUID userId;

        @NotEmpty
        public String password;
    }

}
