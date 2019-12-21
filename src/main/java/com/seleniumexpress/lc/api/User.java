package com.seleniumexpress.lc.api;

public class User extends UserInfoDTO {
	
	private String userId;
	private int lcId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getLcId() {
		return lcId;
	}
	public void setLcId(int lcId) {
		this.lcId = lcId;
	}
	
	

}
