package com.springbook.biz.user.impl;

import java.util.List;

import com.springbook.biz.user.UserVO;

public interface UserService1 {

	// ȸ�� ����
	void insertUser(UserVO vo);

	// ȸ�� ���� ����
	void updateUser(UserVO vo);

	// ȸ�� Ż��
	void deleteUser(UserVO vo);

	// ȸ�� ��ȸ
	UserVO getUser(UserVO vo);

	// ȸ�� ��� ��ȸ
	List<UserVO> getUserList(UserVO vo);

}