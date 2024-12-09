package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Vote;

@Mapper
public interface VoteMapper {
    void insertVote(Vote vote);
    void deleteVote(Long voteId);
    Vote getVoteByUserAndPoll(Long pollId, Long userId);
    List<Vote> getVotesByOptionId(Long optionId);
}
