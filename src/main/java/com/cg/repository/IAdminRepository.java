package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.dto.AdminDto;
import com.cg.entity.Admin10;


@Repository
public interface IAdminRepository extends JpaRepository<Admin10, Integer>{

	@Query("select (b.totalSeats*b.fare )from Bus10 b,BusRoute10 br where b.busRoute=br and  lower(br.routeName)=lower(:routeName)")
	public List<Float> findRevenueByBusRouteRouteName(@Param("routeName") String routeName);

	public boolean existsByAdminUsername(String adminUsername);

	public Admin10 save(AdminDto user);

	public List<Admin10> findByAdminUsername(AdminDto user);

}
