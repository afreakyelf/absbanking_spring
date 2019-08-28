package com.spring.boot;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Imain extends CrudRepository<MainPojo, Integer>{
	
	@Query(value = "select balance from maintable where regd_id=(select reg_id from details where acc_no=?1 or phone = ?1)",nativeQuery = true)
	Long getBalanceById(long accno);
	
	@Query(value = "select is_registered from maintable m,details d where m.regd_id=d.reg_id and (d.acc_no=?1 or d.phone=?1)",nativeQuery = true)
	boolean checkRegistered(long acc_no);
	
	@Modifying
	@Transactional
	@Query(value = "update maintable set havingloan=?2 where regd_id=(select reg_id from details where acc_no=?1 or phone = ?1)",nativeQuery = true)
	void updateHavingLoan(long acc_no,Boolean ishavingLoan);

}
