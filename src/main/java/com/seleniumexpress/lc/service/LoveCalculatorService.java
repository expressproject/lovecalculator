package com.seleniumexpress.lc.service;

import java.util.List;

import com.seleniumexpress.lc.api.User;
import com.seleniumexpress.lc.api.UserInfoDTO;

public interface LoveCalculatorService {
	

	public String calculateLove(String userName, String userCrushName);
	
	public String whatsBetweenUs(char claulationResult);
    
    public List<User> getAllUser();

	public int deleteUserRecordByLcId(int lcId);
	
}
