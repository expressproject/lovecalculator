package com.seleniumexpress.lc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.seleniumexpress.lc.api.User;
import com.seleniumexpress.lc.api.UserInfoDTO;
import com.seleniumexpress.lc.dao.LoveCalculatorDAO;

@Component
public class LoveCalculatorServiceImpl implements LoveCalculatorService {

	private final String LOVE_CAL_FORUMULA = "FLAME";
	
	@Autowired
	private LoveCalculatorDAO loveCalculatorDao;
	
	@Override
	public String calculateLove(String userName,String userCrushName) {
    
		char ret;
		
		int userAndCrushNameCount = (userName+userCrushName).toCharArray().length;
		int formulaCount = LOVE_CAL_FORUMULA.toCharArray().length;
		
		int reminder = userAndCrushNameCount%formulaCount;
		
		if(reminder == 0) {
			ret =  'F';
		}
		else {
		ret = LOVE_CAL_FORUMULA.charAt(reminder);
		}
		
		
		String result = whatsBetweenUs(ret);
		
		//saving to db
		loveCalculatorDao.saveUserDetail("101hardCoded", userName, userCrushName,result);
		
		return result;
	}

	@Override
	public String whatsBetweenUs(char calculationResult) {
		
		String ret = null;
		
		if(calculationResult == 'F') {
			ret = LoveCalculatorConstants.F_CHAR_MEANING;
		}
		else if(calculationResult == 'L'){
			ret =  LoveCalculatorConstants.L_CHAR_MEANING;
		}
		else if(calculationResult == 'A'){
			ret =  LoveCalculatorConstants.A_CHAR_MEANING;
		}
		else if(calculationResult == 'M'){
			ret =  LoveCalculatorConstants.M_CHAR_MEANING;
		}
		else if(calculationResult == 'E'){
			ret =  LoveCalculatorConstants.E_CHAR_MEANING;
		}
		else if(calculationResult == 'S'){
			ret =  LoveCalculatorConstants.S_CHAR_MEANING;
		}
	
	  return ret;
	}

	@Override
	public List<User> getAllUser() {
	   
		return loveCalculatorDao.getAllUserRecord();
	}

	@Override
	public int deleteUserRecordByLcId(int lcId) {
		
		return loveCalculatorDao.deleteUserRecordByLcId(lcId);
		// TODO Auto-generated method stub
		
	}
	

}
