package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Option;

@Mapper
public interface OptionMapper {
void insertOption(Option option);
void updateOption(Option option);
void deleteOption(Long optionId);
List<Option> getOptionsByPollId(Long pollId);
Option getOptionById(Long optionId);
}
