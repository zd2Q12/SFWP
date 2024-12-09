package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.PollStatus;

@Mapper
public interface PollStatusMapper {
	   void insertPollStatus(PollStatus pollStatus);
	    void updatePollStatus(PollStatus pollStatus);
	    PollStatus getPollStatusByPollId(Long pollId);
}
