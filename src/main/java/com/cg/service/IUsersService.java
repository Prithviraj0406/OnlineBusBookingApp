package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.UserDto;
import com.cg.entity.Booking10;
import com.cg.entity.User10;


/**************************************************************************
 * 
 * @author Durga Anand
 * Version: 1.0
 * Description: This is the service layer's IUsersService interface
 * Created date: 20-04-2021
 * 
 ****************************************************************************/

@Service
public interface IUsersService {

	public User10 addUser(UserDto userdto);
	
	public void deleteUser(String username);
	
	public void updatePassword(String username,String newPassword);
	
	

	
}