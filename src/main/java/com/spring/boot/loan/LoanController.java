package com.spring.boot.loan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanInterface loanRepo;
	
	@RequestMapping("/insertloan")
	@ResponseBody
	public void insertLoan(@RequestParam int accNum,@RequestParam int amount,@RequestParam String dol,@RequestParam int duration) {
		Loan loan = new Loan(accNum, amount, dol, duration);
		loanRepo.save(loan);
	}
	
	@RequestMapping("/getallloanbyid")
	@ResponseBody
	public List<Loan> getAllLoanById(@RequestParam int acc_num){
		return loanRepo.getAllLoanById(acc_num);
	}
	
	
	@RequestMapping("/getallloan")
	@ResponseBody
	public List<Loan> getAllLoan(){
		
		return (List<Loan>) loanRepo.findAll();
		
		
	}
	
}

