package com.example.app.service;

import com.example.app.domain.Users;

public interface UserService {

	   //List<Member> getMemberList();
	    //Member getMemberById(Integer id);
	    void addUser(Users user);
	    //void editMember(Member member);
	    //void deleteMember(Integer id);
	    //List<MemberType> getTypeList()

			boolean isCollectNameAndPass(Users user);
}
