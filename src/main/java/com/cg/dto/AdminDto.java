package com.cg.dto;

public class AdminDto 
{
	private String adminUsername;
	private String password;
	
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
	
	
	public AdminDto(String adminUsername, String password) {
		super();
		this.adminUsername = adminUsername;
		this.password = password;
	}
	public AdminDto() {
		super();
		
	}
	
	

}

