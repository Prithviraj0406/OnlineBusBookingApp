package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.dto.BusDto;
import com.cg.entity.Bus10;

/******************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0
 * Description: This is DAO layer's IBusRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IBus extends JpaRepository<Bus10, Integer> {
	
	@Query("select (b.fare*:noOfSeats) from Bus10 b where b.busRoute.routeName like (:routeName) and b.busNumber like(:busnumber)")
	public int getFare(@Param("noOfSeats") int noOfSeats, @Param ("routeName") String routeName, @Param ("busnumber") String busnumber);
}