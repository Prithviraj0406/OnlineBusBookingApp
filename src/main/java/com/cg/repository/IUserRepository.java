package com.cg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.BusOperator10;
import com.cg.entity.User10;

/******************************************************************
 * 
 * @author Durga Anand
 * Version: 1.0
 * Description: This is DAO layer's IUserRepository interface  
 * Created date: 21-04-2021
 * 
 ******************************************************************/

@Repository
public interface IUserRepository extends JpaRepository<User10, Long> 
{

	boolean existsByUsername(String username);
	
	User10 findByUsername(String username);
	
	void save(String newPassword);


	
	
}
