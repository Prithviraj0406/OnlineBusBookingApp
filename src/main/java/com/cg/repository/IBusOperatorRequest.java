package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.entity.BusOperatorRequest10;

/******************************************************************
 * 
 * @author Hima Bindhu
 * Version: 1.0
 * Description: This is DAO layer's IBusOperatorRequestRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

public interface IBusOperatorRequest  extends JpaRepository<BusOperatorRequest10, Integer>{

}