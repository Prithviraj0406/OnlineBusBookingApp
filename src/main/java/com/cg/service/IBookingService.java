package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.BookingDto;
import com.cg.dto.BusDto;
import com.cg.dto.BusRouteDto;
import com.cg.dto.BusRouteDto3;
import com.cg.dto.PassengerDto;
import com.cg.entity.Booking10;
import com.cg.entity.Bus10;
import com.cg.entity.Feedback10;
import com.cg.entity.Passenger10;


/**************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the service layer's IBookingService interface
 * Created date: 21-04-2021
 * 
 ****************************************************************************/


@Service
public interface IBookingService 
{
	public long addBooking(BookingDto bookingdto);
	
	public void deleteBooking(long bookingId); 

	public void updateBookingById(long bookingId, BookingDto booking);

	public Booking10 getBookingDetailsById(long bookingId);

	public Booking10 getAllBookingsByUsername(String username);
	
	public List<Feedback10> getFeedBackByBusRoute(String routeName);
	
	public Passenger10 addPassenger(PassengerDto passengerdto);
	
	public List<BusRouteDto> getBusRoute(String source);
	
	public int getFare(int noofseats,String routeName,String busnumber);
	
	
	
	
	

}