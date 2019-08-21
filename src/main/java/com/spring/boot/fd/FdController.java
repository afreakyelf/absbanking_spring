package com.spring.boot.fd;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.boot.loan.Loan;

@Controller
@RequestMapping("/fixed")
public class FdController {
	
	@Autowired
	FdInterface fdRepo;
	
	@RequestMapping("/insertfd")
	@ResponseBody
	public void insert(@RequestParam long accNum, @RequestParam int amount,@RequestParam String dod,@RequestParam int duration) {
		FixedDeposit fd = new FixedDeposit(accNum, 	amount, dod, duration);
		
		fdRepo.save(fd);
		
	}
	
	@RequestMapping("/getallfdbyid")
	@ResponseBody
	public List<FixedDeposit> getAllById(@RequestParam int acc_num){
		return fdRepo.getAllFdById(acc_num);
	}
	
	@RequestMapping("/getAllFd")
	@ResponseBody
	public List<FixedDeposit> getAllFd(){
		return (List<FixedDeposit>)fdRepo.findAll();
	}
	
	
}
