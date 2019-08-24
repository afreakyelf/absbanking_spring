package com.spring.boot;

import java.util.List;

public class JsonOutputDetails {

	private List<Details> dlist;

	public List<Details> getList() {
		return dlist;
	}

	public void setList(List<Details> dalist) {
		this.dlist = dalist;
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
