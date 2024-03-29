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
	public String insert(@RequestParam long acc_no, @RequestParam int amount,@RequestParam String dod,@RequestParam int duration) {
		FixedDeposit fd = new FixedDeposit(acc_no, 	amount, dod, duration);
		fdRepo.save(fd);
		return "success";
	}
	
	@RequestMapping("/getallfdbyid")
	@ResponseBody
	public FixedDeposit getAllById(@RequestParam long acc_no){
		
		return fdRepo.getAllFdById(acc_no);
	
	}
	
	
	
	@RequestMapping("/getAllFd")
	@ResponseBody
	public FdJsonOutput getAllFd(){
		
		FdJsonOutput jO = new FdJsonOutput();
		jO.savefd((List<FixedDeposit>)fdRepo.findAll());
		
		if(jO.getfd().isEmpty()) {
			jO=  null;
		}
		
		return jO;
	}
	
	
}
