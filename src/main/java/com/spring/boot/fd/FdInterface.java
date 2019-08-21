package com.spring.boot.fd;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.boot.loan.Loan;

public interface FdInterface extends CrudRepository<FixedDeposit, Integer>{
	
	@Query(value="select * from fixeddeposit where acc_num=?1",nativeQuery = true)
	List<FixedDeposit> getAllFdById(int acc_num);
	

}
