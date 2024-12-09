package com.example.app.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PollStatus {
    private Long pollId;
    private PollStatusEnum status;
    private LocalDateTime statusUpdatedAt;
    private Poll poll;

    public enum PollStatusEnum {
        ACTIVE, CLOSED, DRAFT
    }
}
