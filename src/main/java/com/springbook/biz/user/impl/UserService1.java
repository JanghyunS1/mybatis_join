package com.springbook.biz.user.impl;

import java.util.List;

import com.springbook.biz.user.UserVO;

public interface UserService1 {

	// 회원 가입
	void insertUser(UserVO vo);

	// 회원 정보 수정
	void updateUser(UserVO vo);

	// 회원 탈퇴
	void deleteUser(UserVO vo);

	// 회원 조회
	UserVO getUser(UserVO vo);

	// 회원 목록 조회
	List<UserVO> getUserList(UserVO vo);

}