package com.adnj.buddysearchshareutils.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {
    private String command;

    private ChatDto.ChatRoomDto roomInfo;

}
