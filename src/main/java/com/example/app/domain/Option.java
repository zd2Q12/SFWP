package com.example.app.domain;

import java.util.List;

import lombok.Data;

@Data
public class Option {

    private Long optionId;
    private Poll poll;
    private String optionText;
    private Integer votesCount = 0;
    private List<Vote> votes;
}
