package com.adnj.buddysearchshareutils.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageDto {
    private String token;
    private Notification notification;
}
