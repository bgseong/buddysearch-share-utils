package com.adnj.buddysearchshareutils.dto;

import lombok.*;

import java.util.UUID;

public class ChatDto {

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    public static class CreateRequest {
        private UUID firstUserId;

        private UUID secondUserId;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    public static class DeleteChatRequest {
        private String roomId;

        private String messageId;
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    public static class ChatMessageDto {
        private String messageId;

        private String roomId;

        private String senderId;

        private String message;

        private Boolean isDeleted;

        private Long createAt;

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Getter
    @Setter
    public static class ChatRoomDto {
        private String roomId;
        private String otherPersonNickname;
        private String otherPersonId;
        private String otherPersonImageUrl;
        private String lastChat;
        private Long lastChatTime;
    }

}
