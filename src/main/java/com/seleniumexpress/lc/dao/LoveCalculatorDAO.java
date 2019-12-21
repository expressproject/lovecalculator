package com.seleniumexpress.lc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.seleniumexpress.lc.api.User;
import com.seleniumexpress.lc.api.UserInfoDTO;

@Repository
public interface LoveCalculatorDAO {
	
	public List<User> getAllUserRecord();
	public UserInfoDTO saveUserDetail(String userId, String userName, String curshName, String result);
	public int deleteUserRecordByLcId(int id);
}
