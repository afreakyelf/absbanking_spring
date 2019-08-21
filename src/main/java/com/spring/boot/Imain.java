package com.spring.boot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Imain extends CrudRepository<MainPojo, Integer>{
	
	@Query(value = "select balance from maintable where regd_id=(select reg_id from details where acc_no=?1)",nativeQuery = true)
	Long getBalanceById(long accno);
	
	@Query(value = "select is_registered from maintable m,details d where m.regd_id=d.reg_id and d.acc_no=?1",nativeQuery = true)
	boolean checkRegistered(long acc_no);

}
