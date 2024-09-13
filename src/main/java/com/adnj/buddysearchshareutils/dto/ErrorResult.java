package com.adnj.buddysearchshareutils.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResult {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private HttpStatus status;
    private String message;

    public String convertToJson() throws JsonProcessingException{
        return objectMapper.writeValueAsString(this);
    }
}