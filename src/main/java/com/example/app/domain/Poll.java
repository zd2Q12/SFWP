package com.example.app.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Poll {

    private Long pollId;
    private Users user;
    private String title;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Option> options;
    private List<Vote> votes;
}
