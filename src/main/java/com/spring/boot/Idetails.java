package com.spring.boot;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Idetails extends CrudRepository<Details, Integer>{

	@Query(value = "select * from details where acc_no= ?1 or phone = ?2",nativeQuery = true)
	Details getDetailsById(long acc_no,long phone);
	
	@Query(value = "select phone from details where acc_no= ?1 or phone = ?2",nativeQuery = true)
	String getPhNo(long acc_no,long phone);
	
	@Query(value = "select acc_no from details where acc_no= ?1 or phone = ?2",nativeQuery = true)
	Long getAccNo(long acc_no,long phone);
	
	@Query(value="select psswd from details where acc_no=?1 or phone = ?2",nativeQuery = true)
	String getPasswd(long acc_no,long phone);
	
	@Modifying
	@Transactional
	@Query(value = "update details set psswd=?2 where acc_no=?1 or phone = ?3",nativeQuery = true )
	void setPasswd(long acc_no,String passwd,long phone);
	
	
}
