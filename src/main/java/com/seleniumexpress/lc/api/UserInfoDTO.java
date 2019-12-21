package com.seleniumexpress.lc.api;

public class UserInfoDTO {
	
	private String userName;
	private String curshName;
	private String result;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCurshName() {
		return curshName;
	}
	public void setCurshName(String curshName) {
		this.curshName = curshName;
	}
	
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", curshName=" + curshName + ", result=" + result + "]";
	}
	

}
