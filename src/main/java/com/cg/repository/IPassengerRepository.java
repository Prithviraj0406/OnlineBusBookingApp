package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Passenger10;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is DAO layer's IPassengerRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IPassengerRepository extends JpaRepository<Passenger10, Integer>
{
	

}