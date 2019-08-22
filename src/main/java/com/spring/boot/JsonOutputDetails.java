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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	
}
