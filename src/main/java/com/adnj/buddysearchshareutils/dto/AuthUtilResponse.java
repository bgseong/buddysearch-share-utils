package com.adnj.buddysearchshareutils.dto;

import com.adnj.buddysearchshareutils.enums.LoginType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@Builder
public class AuthUtilResponse {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class FindEmail {
        private LoginType type;
        private String email;
        private Long createAt;

        public FindEmail(Integer type, String email, Long createAt) {
            if(type == null){
                this.type = LoginType.DEFAULT;
            }
            else {
                this.type = LoginType.fromCode(type);
            }
            this.email = email;
            this.createAt = createAt;
        }
    }
}
