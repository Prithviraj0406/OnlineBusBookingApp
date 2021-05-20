package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.BusRoute10;

/******************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0
 * Description: This is DAO layer's IBusRouteRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IBusRoute extends JpaRepository<BusRoute10, Integer> {

}