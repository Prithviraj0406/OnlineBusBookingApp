package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.AdminDto;
import com.cg.entity.Admin10;
import com.cg.entity.Booking10;
import com.cg.entity.BusOperator10;
import com.cg.entity.BusRoute10;
import com.cg.entity.User10;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.InvalidRouteNameException;
import com.cg.exception.UsernameAlreadyExistsException;
import com.cg.exception.UsernameNotFoundException;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IBookingRepository;
import com.cg.repository.IBus;
import com.cg.repository.IBusOperator;
import com.cg.repository.IBusRoute;
import com.cg.repository.IUserRepository;

@Service
public class AdminServiceImpl implements IAdminService
{
	@Autowired
	IAdminRepository adminRepository;
	
	@Autowired
	IBookingRepository bookingRepository;
	
	@Autowired
	IBusOperator busOperatorRepository;
	
	@Autowired
	IBusRoute busRouteRepository;
	
	@Autowired
	IBus busrepository;

	@Autowired
	IUserRepository userRepository;
	
	/*************
	 * Method : addUser
	 * Description: method used for adding a new user
	 * 
	 * @param userdto
	 * @return User
	 * Created date: 20 April 2021
	 * 
	 */
	@Override
	public Admin10 addAdmin(AdminDto admindto) 
	{
		Admin10 user = new Admin10();
		if(adminRepository.existsByAdminUsername(admindto.getAdminUsername())) 
		{
			throw new UsernameAlreadyExistsException();
			
		}
		else
		{
		user.setAdminUsername(admindto.getAdminUsername());
		
		user.setPassword(admindto.getPassword());
		return adminRepository.save(user);
		}
	}
	
	
	@Override
	public List<BusOperator10> getAllBusOperators() {
		return busOperatorRepository.findAll();
		
	}
	
	@Override
	public List<Booking10> getAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public List<User10> getAllUsers() {
		return userRepository.findAll();
	}


	@Override
	public void updateBusRoute(int busRouteId, String newBusRoute) {
		
		if(busRouteRepository.existsById(busRouteId)) {
			BusRoute10 route = busRouteRepository.findById(busRouteId).get();
			route.setRouteName(newBusRoute);
			busRouteRepository.save(route);
			
		}
		else {
			throw new InvalidRouteNameException();
		}
	}

	@Override
	public void deleteUser(long userId) {
		
		if(userRepository.existsById(userId))
		{
			userRepository.deleteById(userId);
		}
		else 
		{
			throw new UsernameNotFoundException();
		}
	}
	
	
	public void deleteBusByOperator(String busOperatorUserName)
	{
		if(busOperatorRepository.existsByBusOperatorUsername(busOperatorUserName))
		{
			BusOperator10 busoperator = new BusOperator10();
			busoperator = busOperatorRepository.findByBusOperatorUsername(busOperatorUserName);
			busOperatorRepository.delete(busoperator);
		}
		else 
		{
			throw new IdNotFoundException();
		}
	}

	@Transactional
	@Override
	public List<Float> getRevenueByBusRoute(String routeName) {
		
		return adminRepository.findRevenueByBusRouteRouteName(routeName);
		
	}


	@Override
	public boolean validateAdmin(AdminDto admindto) {
		if(admindto.getAdminUsername().equals("admin") && admindto.getPassword().equals("admin")) {
		   return true;
		}
		else {
			return false;
		}
	}
	
	
	

//	@Transactional
//	@Override
//	public AdminUser10 singIn(AdminDto user) {
//		List<AdminUser10> admin = adminRepository.findByAdminUsername(user);
//				
//        for (AdminUser10 other : admin) {
//            if (other.equals(user.getAdminUsername())) {
//            	user.setLoggedIn(true);
//            	return adminRepository.save(user);
//                
//            }
//        }
//		return null;
//		
//	}
//	
//	
//	@Override
//	public AdminUser10 singOut(AdminDto user) {
//		List<AdminUser10> admin = adminRepository.findByAdminUsername(user);
//		
//        for (AdminUser10 other : admin) {
//            if (other.equals(user.getAdminUsername())) {
//            	user.setLoggedIn(false);
//            	return adminRepository.save(user);
//                
//            }
//        }
//		return null;
//		
//	}
	
	
	

}
