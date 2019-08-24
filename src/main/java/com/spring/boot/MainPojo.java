package com.spring.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="maintable")
public class MainPojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	long regd_id;
	boolean isRegistered;
	boolean havingloan;
	long balance;
	
	public MainPojo() {
		super();
	}

	public MainPojo(long regd_id, boolean isRegistered, boolean havingloan, long balance) {
		super();
		this.regd_id = regd_id;
		this.isRegistered = isRegistered;
		this.havingloan = havingloan;
		this.balance = balance;
	}

	public long getRegd_id() {
		return regd_id;
	}

	public void setRegd_id(long regd_id) {
		this.regd_id = regd_id;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public boolean isHavingloan() {
		return havingloan;
	}

	public void setHavingloan(boolean havingloan) {
		this.havingloan = havingloan;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "MainPojo [regd_id=" + regd_id + ", isRegistered=" + isRegistered + ", havingloan=" + havingloan
				+ ", balance=" + balance + "]";
	}
	
	
	

}
