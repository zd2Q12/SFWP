package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.Users;

@Mapper
public interface UserMapper {
    void insertUser(Users user);
    void updateUser(Users user);
    void deleteUser(Long userId);
    Users getUserByNameAndPass(Users user);
    List<Users> getAllUsers();
}
