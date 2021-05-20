package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Booking10;
import com.cg.entity.Feedback10;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IBookingRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IBookingRepository extends JpaRepository<Booking10, Long>
{

	public Booking10 findAllByBookingId(long bookingId);

	boolean existsByBookingId(long bookingId);

	@Query("select b from Booking10 b , User10 u where b.username=u.username and u.username=:username")
	public Booking10 findAllByUsername(@Param("username") String username);
		
	@Query("select fb from Feedback10 fb where fb.routeName = :routeName  ")
	public List<Feedback10> getFeedBackByBusRoute(@Param("routeName") String routeName);

	



	
}
