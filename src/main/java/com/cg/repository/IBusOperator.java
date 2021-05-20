package com.cg.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.entity.BusOperator10;

/******************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0
 * Description: This is DAO layer's IBusOperatorRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

public interface IBusOperator extends JpaRepository<BusOperator10, Integer> {

	public boolean existsByBusOperatorUsername(String busOperatorUsername);

	public BusOperator10 findByBusOperatorUsername(String busOperatorUsername);

	@Query("select (b.totalSeats*b.fare )from Bus10 b,BusRoute10 br where b.busRoute=br and  lower(br.routeName)=lower(:routeName)")
	public List<Float> findRevenueByBusRouteRouteName(@Param("routeName") String routeName);

	@Query("select (b.totalSeats*b.fare )from Bus10 b,BusRoute10 br,Booking10 bo where b.busRoute=br and lower(br.routeName)=lower(:routeName) and extract (month from bo.datenm)=:month")
	public List<Float> findMonthlyRevenueByBusRouteRouteName(@Param("routeName") String routeName,
			@Param("month") int month);

	@Query("select (b.totalSeats*b.fare )from Bus10 b,BusRoute10 br, Booking10 bo where b.busRoute=br and lower(br.routeName)=lower(:routeName) and bo.datenm=:date")
	public List<Float> getRevenueByBusRouteAndDate(@Param("routeName") String routeName,
			@Param("date") LocalDate date);

	@Query("select (b.totalSeats*b.fare )from Bus10 b,BusRoute10 br ,Booking10 bo where b.busRoute=br and lower(br.routeName)=lower(:routeName) and extract (year from bo.datenm)=:year")
	public List<Float> getYearlyRevenueByBusRoute(@Param("routeName") String routeName, @Param("year") int year);

}
