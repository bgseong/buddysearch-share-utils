package com.adnj.buddysearchshareutils.dto;

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
        private String email;
    }
}
