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
	public JsonLoan getAllLoanById(@RequestParam int acc_num){
		
		JsonLoan jL = new JsonLoan();
		jL.setLoan(loanRepo.getAllLoanById(acc_num));
		
		return jL;
	}
	
	
	@RequestMapping("/getallloan")
	@ResponseBody
	public JsonLoan getAllLoan(){
		
		JsonLoan jL = new JsonLoan();
		jL.setLoan((List<Loan>) loanRepo.findAll());
		
		return jL ;
		
		
	}
	
}

