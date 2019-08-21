package com.spring.boot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Idetails extends CrudRepository<Details, Integer>{

	@Query(value = "select * from details where acc_no= ?1",nativeQuery = true)
	Details getDetailsById(long acc_no);
	
	@Query(value = "select phone from details where acc_no= ?1",nativeQuery = true)
	String getPhNo(long acc_no);
	
	
}
