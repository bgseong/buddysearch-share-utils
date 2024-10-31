package com.adnj.buddysearchshareutils.dto;

import lombok.*;

import java.util.UUID;

public class LogDto {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Report{
        private UUID reporterId;
        private UUID reportedUserId;
        private String body;
        private String reason;
    }
}
