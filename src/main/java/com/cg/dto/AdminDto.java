package com.cg.dto;

public class AdminDto 
{
	private String adminUsername;
	private String password;
	private boolean loggedIn;
	
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public AdminDto(String adminUsername, String password) {
		super();
		this.adminUsername = adminUsername;
		this.password = password;
	}
	
	public AdminDto(String adminUsername, String password, boolean loggedIn) {
		super();
		this.adminUsername = adminUsername;
		this.password = password;
		this.loggedIn = loggedIn;
	}
	public AdminDto() {
		super();
		
	}
	
	

}

