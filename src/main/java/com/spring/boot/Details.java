package com.spring.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="details")
public class Details {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long acc_no;
	String bank_id;
	String aadhar;
	String f_name;
	String l_name;
	String full_name;
	String phone;
	String zip;
	String date;
	String psswd;
	long regId;
	String pan_no;
	
	
	public Details() {
		super();
	}



	public Details(long acc_no, String bank_id, String aadhar, String f_name, String l_name, String full_name,
			String phone, String zip, String date, String psswd, long regId, String pan_no) {
		super();
		this.acc_no = acc_no;
		this.bank_id = bank_id;
		this.aadhar = aadhar;
		this.f_name = f_name;
		this.l_name = l_name;
		this.full_name = full_name;
		this.phone = phone;
		this.zip = zip;
		this.date = date;
		this.psswd = psswd;
		this.regId = regId;
		this.pan_no = pan_no;
	}







	public long getAcc_no() {
		return acc_no;
	}


	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}


	public String getBank_id() {
		return bank_id;
	}


	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}


	public String getAadhar() {
		return aadhar;
	}


	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getFull_name() {
		return full_name;
	}


	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public long getRegId() {
		return regId;
	}


	public void setRegId(long regId) {
		this.regId = regId;
	}




	public String getPsswd() {
		return psswd;
	}




	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}

	
	


	public String getPan_no() {
		return pan_no;
	}



	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}



	@Override
	public String toString() {
		return "Details [acc_no=" + acc_no + ", bank_id=" + bank_id + ", aadhar=" + aadhar + ", f_name=" + f_name
				+ ", l_name=" + l_name + ", full_name=" + full_name + ", phone=" + phone + ", zip=" + zip + ", date="
				+ date + ", psswd=" + psswd + ", regId=" + regId + ", pan_no=" + pan_no + "]";
	}

	
	
}
