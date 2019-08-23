package com.spring.boot.fd;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.boot.loan.Loan;

public interface FdInterface extends CrudRepository<FixedDeposit, Integer>{
	
	@Query(value="select * from fixeddeposit where acc_no=?1",nativeQuery = true)
	FixedDeposit getAllFdById(long acc_no);
	

}
