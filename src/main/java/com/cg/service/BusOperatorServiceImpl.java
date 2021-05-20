package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.BusDto;
import com.cg.dto.BusOperatorDto;
import com.cg.dto.BusRouteDto;
import com.cg.entity.Bus10;
import com.cg.entity.BusOperator10;
import com.cg.entity.BusRoute10;
import com.cg.exception.InvalidUsernameException;
import com.cg.repository.IBus;
import com.cg.repository.IBusOperator;
import com.cg.repository.IBusRoute;


/******************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0
 * Description: This is the service implementation class of the function declared in the 
 * 				service interface IBusOperatorService that autowires a bean of IBusOperator,
 * 				IBus and IBusRoute to perform JPA Functions
 * Created date: 20-04-2021
 * 
 ******************************************************************/

@Service
public class BusOperatorServiceImpl implements IBusOperatorService {

	@Autowired
	IBusOperator busoperatorRepository;
	
	@Autowired
	IBus busRepository;
	
	@Autowired
	IBusRoute busrouteRepository;
	
	/*******************************************************
	 * Method : addBusOperator
	 * Description: Method is created to add new BusOperator 
	 * Created Date: 20 April 2021
	 */
	
	@Transactional
	@Override
	public BusOperator10 addBusOperator(BusOperatorDto busoperatordto) {
		
		BusOperator10 busoperator = new BusOperator10();
		busoperator.setBusOperatorUsername(busoperatordto.getUserId());
		busoperator.setPassword(busoperatordto.getPassword());
		return busoperatorRepository.save(busoperator);
		
	}

	
	/***********************************************************
	 * Method : getRevenueByBusRoute
	 * Description: Method is created to get revenue byBusRoute
	 * Created Date: 20 April 2021
	 */
	
	@Transactional
	@Override
	public List<Float> getRevenueByBusRoute(String routeName) {
		
		return busoperatorRepository.findRevenueByBusRouteRouteName(routeName);
		
	}
	
	
	/***************************************************************
	 * Method : getMonthlyRevenueByBusRoute
	 * Description: Method is created to getmonthly revenue by BusRoute
	 * Created Date: 20 April 2021 
	 */
	
	@Transactional
	@Override
	public List<Float> getMonthlyRevenueByBusRoute(String routeName, int month) {
		
		return busoperatorRepository.findMonthlyRevenueByBusRouteRouteName(routeName, month);
		
	}
	
	
	/*********************************************************************
	 * Method : getRevenueByBusRouteAndDate
	 * Description: Method is created to get daily revenue by BusRoute
	 * Created Date: 20 April 2021 
	 */

	@Transactional
	@Override
	public List<Float> getRevenueByBusRouteAndDate(String routeName, LocalDate date) {
		
		return busoperatorRepository.getRevenueByBusRouteAndDate(routeName, date);
		
	}
	
	
   /*******************************************************************
    * Method :  getYearlyRevenueByBusRoute
    * Description: Method is created to get yearly revenue by BusRoute
    *  Created Date: 20 April 2021
    */
	
	@Transactional
	@Override
	public List<Float> getYearlyRevenueByBusRoute(String routeName, int year) {
		
		return busoperatorRepository.getYearlyRevenueByBusRoute(routeName, year);
		
	}
	
	
	/*************************************************
	 * Method : addBus
	 * Description: Method is created to add new Bus
	 * Created Date: 20 April 2021
	 */

	@Transactional
	@Override
	public Bus10 addBus(BusDto busdto) {
		
		Bus10 bus = new Bus10();
		BusRoute10 busroute = busrouteRepository.findById(busdto.getBusRouteId()).get();
		bus.setBusNumber(busdto.getBusNumber());
		bus.setFare(busdto.getFare());
		bus.setTotalSeats(busdto.getTotalSeats());
		bus.setBusRoute(busroute);
		return busRepository.save(bus);
		
	}
	
	
	/*************************************************************
	 * Method : addBusRoute
	 * Description: Method is created to add new BusRoute
	 * Created Date : 21 April 2021
	 */

	@Transactional
	@Override
	public BusRoute10 addBusRoute(BusRouteDto busroutedto) {
		
		BusRoute10 busroute = new BusRoute10();
		busroute.setDestination(busroutedto.getDestination());
		busroute.setRouteName(busroutedto.getRouteName());
		busroute.setSource(busroutedto.getSource());
		return busrouteRepository.save(busroute);
		
	}

	
	/************************************************************
	 * Method : updatePassword
	 * Description: Method is created to update password
	 * Created Date : 21 April 2021
	 */
	
	@Transactional
	@Override
	public void updatePassword(String Username, String newpassword) {
		
		if (busoperatorRepository.existsByBusOperatorUsername(Username)) {
			BusOperator10 busoperator = busoperatorRepository.findByBusOperatorUsername(Username);
			busoperator.setPassword(newpassword);
			busoperatorRepository.save(busoperator);
		} else {
			throw new InvalidUsernameException();
		}

	}
	
}
