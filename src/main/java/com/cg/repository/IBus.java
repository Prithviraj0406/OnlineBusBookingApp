package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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

}