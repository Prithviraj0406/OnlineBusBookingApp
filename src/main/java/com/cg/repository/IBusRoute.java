package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.dto.BusRouteDto;
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
	
	@Query("select new com.cg.dto.BusRouteDto(br.routeName,br.source,br.destination) from BusRoute10 br where br.source=:source")
	public List<BusRouteDto> getBySource(@Param("source") String source);
	

}