package com.spring.boot;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/details")
public class deptService {

	@Autowired
	Idetails drepo;
	@Autowired
	Imain main;
	
	@RequestMapping(path="/insert")
	@ResponseBody
	public String create(
	@RequestParam String aadhar,
	@RequestParam String pan,
	@RequestParam String f_name,
	@RequestParam String l_name,
	@RequestParam String phone,
	@RequestParam String dob,
	@RequestParam String zip,
	@RequestParam String passwd) throws ParseException {
		
		long regid=(int) (Math.random()*1000000);
		MainPojo m=new MainPojo();
		m.setRegd_id(regid);m.setRegistered(true);m.setHavingloan(false);
		main.save(m);
		
		String bank_id=f_name.substring(0, 3)+String.valueOf((int)(Math.random()*1000))+"@abs";
		Details d=new Details();
		d.setAadhar(aadhar);
		d.setPan_no(pan);
		d.setBank_id(bank_id);
		d.setDate(dob);
		d.setF_name(f_name);
		d.setL_name(l_name);
		d.setFull_name(f_name+" "+l_name);
		d.setPhone(phone);
		d.setZip(zip);
		d.setRegId(regid);
		d.setpasswd(passwd);
		drepo.save(d);
		
		return "Success";
	}
	
	@GetMapping(path="/personal",produces = "application/json")
	@ResponseBody
	public Details getDetailById(@RequestParam long acc_no) {
		return drepo.getDetailsById(acc_no);
	}
	
	@GetMapping(path="/checkRegister",produces = "application/json")
	@ResponseBody
	public IsUserExist checkRegistered(@RequestParam long acc_no) {
		
		IsUserExist obj =new IsUserExist();
		
		try {
			obj.setIsExist(main.checkRegistered(acc_no));
			obj.setPhone(drepo.getPhNo(acc_no));
		}catch(Exception e) {
			
		}
		
		return obj;
	}
	
	@GetMapping(path = "/getPasswd",produces = "application/json")
	@ResponseBody
	public PasswdOutput getPasswd(@RequestParam long acc_no) {
		PasswdOutput p=new PasswdOutput();
		try {
			main.checkRegistered(acc_no);
			 p.setPasswd(drepo.getPasswd(acc_no));
			 p.setPhone(Long.parseLong(drepo.getPhNo(acc_no)));
			 p.setAcc_no(drepo.getAccNo(acc_no));
			 return p;
		}catch(Exception e) {
			System.out.println("At get passwd in detailsrepo "+e);
		}
			p.setPasswd(null);
		return p;
	}
	
	@GetMapping(path = "/updatePasswd",produces = "application/json")
	@ResponseBody
	public String updatePasswd(long acc_no,String passwd) {
		try {
			main.checkRegistered(acc_no);
			drepo.setPasswd(acc_no, passwd);
			return "success";
		}catch(Exception e) {
			System.out.println("At updating passwd in detailsrepo "+e);
		}
		return null;
	}
	
	
	
	@GetMapping(path="/list",produces="application/json")
	@ResponseBody
	public JsonOutputDetails allList() {
		JsonOutputDetails d = new JsonOutputDetails();
		d.setList((List<Details>)drepo.findAll());
		return  d;
	}
	
	@GetMapping(path="/mainList",produces="application/json")
	@ResponseBody
	public JsonOutputMain allMainList()
	{
		JsonOutputMain m=new JsonOutputMain();
		m.setList((List<MainPojo>)main.findAll());
		return m;
	}
	
	
	@GetMapping(path="/balanceOf",produces="application/json")
	@ResponseBody
	public BalanceOutput getBalance(@RequestParam long acc_no)
	{
		BalanceOutput m=new BalanceOutput();
		long balance = main.getBalanceById(acc_no);
		m.setBalance(balance);
		return m;
	}
	
	@GetMapping(path="/setImage",produces = "application/json")
	@ResponseBody
	public String getDetailById(@RequestParam long acc_no,@RequestParam String image_url) {
		drepo.updateImageUrl(acc_no, image_url);
		return "Success"; 
	}

	@GetMapping(path="/setaadharImage",produces = "application/json")
	@ResponseBody
	public String setAadharImage(@RequestParam long acc_no,@RequestParam String aadhar_url) {
		drepo.updateAadharUrl(acc_no, aadhar_url);
		return "Success"; 
	}
	
	@GetMapping(path="/setpanImage",produces = "application/json")
	@ResponseBody
	public String setPanImage(@RequestParam long acc_no,@RequestParam String pan_url) {
		drepo.updatePanUrl(acc_no, pan_url);
		return "Success"; 
	}
	
	
	
	
}
