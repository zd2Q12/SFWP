package com.example.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.domain.Users;
import com.example.app.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserMapper userMapper;
	
	@Override
	public void addUser(Users user) {
		userMapper.insertUser(user);
		
	}

}
