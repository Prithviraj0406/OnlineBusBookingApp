package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.AdminDto;
import com.cg.entity.Admin10;
import com.cg.entity.Booking10;
import com.cg.entity.BusOperator10;
import com.cg.entity.User10;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.InvalidBusOperatorException;
import com.cg.exception.InvalidRouteNameException;
import com.cg.exception.InvalidUsernameException;
import com.cg.exception.OnlineBusBookingValidationException;
import com.cg.exception.UsernameNotFoundException;
import com.cg.service.AdminServiceImpl;

import io.swagger.annotations.Api;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is controller methods implementation
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@RestController
@Api(value = "Admin API")
@RequestMapping(value = "/OnlineBusBooking/admin")
public class AdminController 
{
	@Autowired
	AdminServiceImpl adminService;
	
	@PostMapping(value="/addAdmin")
	public Admin10 addAdmin(@Valid @RequestBody AdminDto admindto, BindingResult bindingresult) 
	{
		if (bindingresult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingresult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new OnlineBusBookingValidationException(errMessages);

		}
		
		try{
			return adminService.addAdmin(admindto);
		}
		catch (InvalidBusOperatorException exception) {
			throw new InvalidBusOperatorException("one or more entered field contains invalid object");

		}
	}
	
	@GetMapping(value="/getAllBusOperators")
	public List<BusOperator10> getAllBusOperators()
	{		
		
			return adminService.getAllBusOperators();
		
		
	}
	
	@GetMapping(value="getAllBookings")
	public List<Booking10> getAllBookings() {
		return adminService.getAllBookings();
	}
	
	
	@GetMapping(value="getAllUsers")
	public List<User10> getAllUsers() {
		return adminService.getAllUsers();
	}
	
	
	
	@PutMapping(value="/updateRouteName/{busId}")
	public void updateBusRoute(@Valid @PathVariable int busId, @RequestBody String newBusRoute, BindingResult bindingresult)
	{
		if (bindingresult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingresult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new OnlineBusBookingValidationException(errMessages);

		}
		
		try{
			adminService.updateBusRoute(busId, newBusRoute);
		}
		catch (InvalidBusOperatorException exception) {
			throw new InvalidBusOperatorException("one or more entered field contains invalid object");

		}
		
	}
	
	@DeleteMapping(value="/deleteUser/{userId}")
	public void deleteUser(@PathVariable int userId)
	{
		try{
			adminService.deleteUser(userId);
		}
		catch(UsernameNotFoundException e)
		{
			throw new UsernameNotFoundException("Invalid User Id");
		}
	}
	
	
	@DeleteMapping(value="/deleteBusByOperator/{busOperatorUserName}")
	public void deleteBusByOperator(@PathVariable String busOperatorUserName)
	{
		try{
			adminService.deleteBusByOperator(busOperatorUserName);
		}
		catch(InvalidUsernameException e)
		{
			throw new InvalidUsernameException("Invalid Username");
		}
	}
	
	@GetMapping(value="/getRevenueByBusRoute/{routeName}")
	public List<Float> getRevenueByBusRoute(@PathVariable String routeName)
	{
		try{
			return adminService.getRevenueByBusRoute(routeName);
		}
		 catch (InvalidRouteNameException exception) 
		{
				throw new InvalidRouteNameException("No such routename was found");
		}
	}
	
//	@GetMapping(value="/singIn")
//	public AdminUser10 singIn(AdminDto user)
//	{
//		return adminService.singIn(user);
//	}
//	
//	@GetMapping(value="/singOut")
//	public AdminUser10 singOut(AdminDto user)
//	{
//		return adminService.singOut(user);
//	}

}