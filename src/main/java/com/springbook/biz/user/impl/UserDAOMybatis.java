package com.springbook.biz.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository
public class UserDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis; 	// mybatis : 1. db, 2. mapper
	
	
	// ȸ�� ����
	public void insertUser(UserVO vo) {
		System.out.println("Mybatis�� ����ؼ� insertUser() �޼ҵ� ȣ���");
		
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println(vo.getPassword());
		System.out.println(vo.getRole());
		
		
		
		mybatis.insert("UserDAO.insertUser", vo);
	}
	
	// ȸ�� ���� ����
	public void updateUser(UserVO vo) {
		System.out.println("Mybatis�� ����ؼ� updateUser() �޼ҵ� ȣ���");
		mybatis.update("UserDAO.updateUser", vo);
	}
	
	// ȸ�� Ż��
	public void deleteUser(UserVO vo) {
		System.out.println("Mybatis�� ����ؼ� deleteUser() �޼ҵ� ȣ���");
		mybatis.delete("UserDAO.deleteUser", vo);
	}
	
	// ȸ�� ��ȸ
	public UserVO getUser(UserVO vo) {
		System.out.println("Mybatis�� ����ؼ� getUser() �޼ҵ� ȣ���");
		return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);
	}
	
	// ȸ�� ��� ��ȸ
	public List<UserVO> getUserList(UserVO vo) {
		System.out.println("Mybatis�� ����ؼ� getUserList() �޼ҵ� ȣ���");
		return mybatis.selectList("UserDAO.getUserList", vo);
	}
	
	
	
	
	
	
	
	
}
