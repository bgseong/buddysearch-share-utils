package com.adnj.buddysearchshareutils.dto;

import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class SendMessageDto<T> {
    private String roomId;

    private T message;

    private String type;


}
