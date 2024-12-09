package com.example.app.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Users {

    private Long userId;
    private String username;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
