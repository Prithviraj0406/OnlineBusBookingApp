package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.BusOperator10;
import com.cg.entity.Feedback10;

/******************************************************************
 * 
 * @author Prithviraj V
 * Version: 1.0
 * Description: This is DAO layer's IFeedbackRepository interface  
 * Created date: 23-04-2021
 * 
 ******************************************************************/

@Repository
public interface IFeedBackRepository extends JpaRepository<Feedback10, Integer>
{

	boolean existsByRouteName(String routeName);
	
	public List<Feedback10> findByRouteName(String routeName);
	
	@Query("select fb from Feedback10 fb "
			+ "where fb.busoperator=:busoperator")
	public List<Feedback10> findByBusOperator(@Param("busoperator") BusOperator10 busoperator);
	
	
}