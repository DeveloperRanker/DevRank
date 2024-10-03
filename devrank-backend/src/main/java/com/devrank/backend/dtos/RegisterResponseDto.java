package com.devrank.backend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponseDto {

    private String message;
    private String username;
    private String email;
    //TODO how do I generate this?
    private String accessToken;
    //TODO how do I generate this?
    private String refreshToken;

    public RegisterResponseDto(String message, String username, String email) {
        this.message = message;
        this.username = username;
        this.email = email;
    }

}
