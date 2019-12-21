package com.seleniumexpress.lc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.seleniumexpress.lc.api.User;
import com.seleniumexpress.lc.api.UserInfoDTO;

public class UserHistoryRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	 User user = new User();
	 int lcId = rs.getInt(1);
	 String userName = rs.getString(2);
	 String crushName = rs.getString(3);
	 String result = rs.getString(4);
	
	 user.setUserName(userName);
	 user.setCurshName(crushName);
	 user.setResult(result);
	 user.setLcId(lcId);
	 
	 return user;
	}
	
	

}
