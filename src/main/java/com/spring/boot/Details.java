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
	String passwd;
	long regId;
	String pan_no;
	String image_url;
	String pan_url;
	String aadhar_url;
	
	
	public Details() {
		super();
	}

	@Override
	public String toString() {
		return "Details [acc_no=" + acc_no + ", bank_id=" + bank_id + ", aadhar=" + aadhar + ", f_name=" + f_name
				+ ", l_name=" + l_name + ", full_name=" + full_name + ", phone=" + phone + ", zip=" + zip + ", date="
				+ date + ", passwd=" + passwd + ", regId=" + regId + ", pan_no=" + pan_no + ", image_url=" + image_url
				+ ", pan_url=" + pan_url + ", aadhar_url=" + aadhar_url + "]";
	}

	public Details(long acc_no, String bank_id, String aadhar, String f_name, String l_name, String full_name,
			String phone, String zip, String date, String passwd, long regId, String pan_no, String image_url,
			String pan_url, String aadhar_url) {
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
		this.passwd = passwd;
		this.regId = regId;
		this.pan_no = pan_no;
		this.image_url = image_url;
		this.pan_url = pan_url;
		this.aadhar_url = aadhar_url;
	}

	public String getPan_url() {
		return pan_url;
	}

	public void setPan_url(String pan_url) {
		this.pan_url = pan_url;
	}

	public String getAadhar_url() {
		return aadhar_url;
	}
	
	public void setAadhar_url(String aadhar_url) {
		this.aadhar_url = aadhar_url;
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




	public String getpasswd() {
		return passwd;
	}




	public void setpasswd(String passwd) {
		this.passwd = passwd;
	}

	
	


	public String getPan_no() {
		return pan_no;
	}



	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}




	public String getImage_url() {
		return image_url;
	}




	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	
}
