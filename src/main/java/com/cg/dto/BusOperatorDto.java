package com.cg.dto;

import javax.validation.constraints.NotEmpty;

/*********************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the BusOpeartor module
 *
 *********************************************************************/

public class BusOperatorDto {
	@NotEmpty(message = "username should not be empty")
	private String userId;
	@NotEmpty(message = "password should not be empty")
	private String password;

	public BusOperatorDto(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;

	}

	public BusOperatorDto() {
		super();

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
