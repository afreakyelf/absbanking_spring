package com.spring.boot;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

public class JsonOutputDetails {

	private List<Details> dlist;

	public List<Details> getList() {
		return dlist;
	}

	public void setList(List<Details> dalist) {
		this.dlist = dalist;
	}
	
}


class AadharOutput{
	
	
	private String aadhar;
	private String aadhar_url;
	

	public String getAadhar_url() {
		return aadhar_url;
	}

	public void setAadhar_url(String aadhar_url) {
		this.aadhar_url = aadhar_url;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	
}


class PanOutput{
	
	private String pan_no;
	private String pan_url;
	

	public String getPan_url() {
		return pan_url;
	}

	public void setPan_url(String pan_url) {
		this.pan_url = pan_url;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	
	
	
}

class PasswdOutput {

	private String passwd;
	private long phone;
	private long acc_no;


	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	
}
