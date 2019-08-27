package com.spring.boot;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Idetails extends CrudRepository<Details, Integer>{

	@Query(value = "select * from details where acc_no= ?1 or phone = ?1",nativeQuery = true)
	Details getDetailsById(long acc_no);
	
	@Query(value = "select phone from details where acc_no= ?1 or phone = ?1",nativeQuery = true)
	String getPhNo(long acc_no);
	
	@Query(value = "select acc_no from details where acc_no= ?1 or phone = ?1",nativeQuery = true)
	Long getAccNo(long acc_no);
	
	@Query(value="select passwd from details where acc_no=?1 or phone = ?1",nativeQuery = true)
	String getPasswd(long acc_no);
	
	@Modifying
	@Transactional
	@Query(value = "update details set passwd=?2 where acc_no=?1 or phone = ?1",nativeQuery = true )
	void setPasswd(long acc_no,String passwd);
	
	@Modifying
	@Transactional
	@Query(value = "update details set image_url=?2 where acc_no=?1 or phone = ?1",nativeQuery = true)
	void updateImageUrl(long acc_no,String image_url);

	@Modifying
	@Transactional
	@Query(value = "update details set aadhar_url=?2 where acc_no=?1 or phone = ?1",nativeQuery = true)
	void updateAadharUrl(long acc_no,String aadhar_url);
	
	@Modifying
	@Transactional
	@Query(value = "update details set pan_url=?2 where acc_no=?1 or phone = ?1",nativeQuery = true)
	void updatePanUrl(long acc_no,String pan_url);
	
}
