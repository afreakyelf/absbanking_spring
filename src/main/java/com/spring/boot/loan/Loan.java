package com.spring.boot.loan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "loan")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int accNum;
	int amount;
	String dol;
	int duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDol() {
		return dol;
	}

	public void setDol(String dol) {
		this.dol = dol;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", accNum=" + accNum + ", amount=" + amount + ", dol=" + dol + ", duration="
				+ duration + "]";
	}

	public Loan(int accNum, int amount, String dol, int duration) {
		super();
		this.accNum = accNum;
		this.amount = amount;
		this.dol = dol;
		this.duration = duration;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

}

