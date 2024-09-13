package com.adnj.buddysearchshareutils.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

public class LogDto {

    @Data
    @Builder
    public static class Report{
        private UUID reporterId;
        private UUID reportedUserId;
        private String body;
        private String reason;
    }
}
