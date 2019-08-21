package com.spring.boot.loan;

import java.util.List;

public class JsonLoan {
	
	private List<Loan> loan;
	
	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	
	public List<Loan> getLoan(){
		return loan;
	}

}
