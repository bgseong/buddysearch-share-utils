package com.adnj.buddysearchshareutils.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TokenDto {
    private String accessToken;

    private String refreshToken;
}
