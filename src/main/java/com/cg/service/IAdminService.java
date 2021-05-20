package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.AdminDto;
import com.cg.entity.Admin10;
import com.cg.entity.Booking10;
import com.cg.entity.BusOperator10;
import com.cg.entity.User10;

@Service
public interface IAdminService {

	public Admin10 addAdmin(AdminDto admindto);

	public List<BusOperator10> getAllBusOperators();
	
	public void updateBusRoute(int busRouteId, String newBusRoute);
	
	public void deleteUser(long userId);
	
	public void deleteBusByOperator(String busOperatorUserName);
	
	public List<Float> getRevenueByBusRoute(String routeName);

	public List<Booking10> getAllBookings();
	
	public List<User10> getAllUsers();

	
	
//	public AdminUser10 singIn(AdminDto user);
//	
//	public AdminUser10 singOut(AdminDto user);

	



	
	
}
