package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Poll;

@Mapper
public interface PollMapper {

	void insertPoll(Poll poll);
	void updatePoll(Poll poll);
	void deletePoll(Long pollId);
	Poll getPollById(Long pollId);
	List<Poll> getPollsByUserId(Long userId);
	List<Poll> getPollsByStatus(String status);
	
}
