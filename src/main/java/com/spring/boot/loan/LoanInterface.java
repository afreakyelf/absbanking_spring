package com.spring.boot.loan;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoanInterface extends CrudRepository<Loan, Integer>{
	
	@Query(value="select * from loan where acc_num=?1",nativeQuery = true)
	Loan getAllLoanById(int acc_num);

}
