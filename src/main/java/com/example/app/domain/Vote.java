package com.example.app.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Vote {

    private Long voteId;
    private Users user;
    private Poll poll;
    private Option option;
    private LocalDateTime votedAt;
}
