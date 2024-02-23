package com.syj.spring.ex.jsp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.syj.spring.ex.jsp.domain.User;

@Mapper
public interface UserRepository {

	public int insertUser(
			@Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email
			, @Param("introduce") String introduce);
	
	public User selectLastUser();
	
}
