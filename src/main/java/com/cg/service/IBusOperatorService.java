package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.BusDto;
import com.cg.dto.BusOperatorDto;
import com.cg.dto.BusRouteDto;
import com.cg.entity.Bus10;
import com.cg.entity.BusOperator10;
import com.cg.entity.BusRoute10;


/**************************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0
 * Description: This is the service layer's IBusOperatorService interface
 * Created date: 20-04-2021
 * 
 ****************************************************************************/


@Service
public interface IBusOperatorService {

	public BusOperator10 addBusOperator(BusOperatorDto busoperatordto);

	public Bus10 addBus(BusDto busdto);

	public BusRoute10 addBusRoute(BusRouteDto busroutedto);

	public void updatePassword(String Username, String newpassword);

	public List<Float> getRevenueByBusRoute(String routeName);

	public List<Float> getMonthlyRevenueByBusRoute(String routeName, int month);

	public List<Float> getRevenueByBusRouteAndDate(String routeName, LocalDate date);

	public List<Float> getYearlyRevenueByBusRoute(String routeName, int year);

}