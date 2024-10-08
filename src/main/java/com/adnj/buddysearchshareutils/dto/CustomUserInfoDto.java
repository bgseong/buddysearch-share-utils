package com.adnj.buddysearchshareutils.dto;

import com.adnj.buddysearchshareutils.enums.UserStatus;
import lombok.*;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class CustomUserInfoDto {

    private UUID userId;
    private String nickName;
    private String name;
    private String email;
    private String role;
    private String imgUrl;
    private UserStatus status;


}
