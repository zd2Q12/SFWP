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
	public boolean isCollectNameAndPass(Users user) {//フォームから送信されたデータ
		Users getUser = userMapper.getUserByNameAndPass(user);//DBから該当ユーザーの行取得

		//ユーザー名確認->正しくなければデータは渡されない
		//ユーザー名・パスワードの確認・セット
		if((getUser == null) || !user.getUsername().equals(getUser.getUsername())|| !user.getPassword().equals(getUser.getPassword())) {
			return false;
		}
		//ユーザー情報（id, email）をセット
		user.setUserId(getUser.getUserId());
		user.setEmail(getUser.getEmail());
		return  true;//認証成功
	}

	@Override
	public void addUser(Users user) {
		userMapper.insertUser(user);
	}
}
