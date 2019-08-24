package com.spring.boot.fd;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "fixeddeposit")
public class FixedDeposit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column(name = "acc_no")
	long accNum;

	int amount;

	String dod;

	int duration;
	
	

	public FixedDeposit() {
		super();
	}

	@Override
	public String toString() {
		return "FixedDeposit [id=" + id + ", accNum=" + accNum + ", amount=" + amount + ", dod=" + dod + ", duration="
				+ duration + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDod() {
		return dod;
	}

	public void setDod(String dod) {
		this.dod = dod;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FixedDeposit(long accNum2, int amount, String dod, int duration) {
		super();
		this.accNum = accNum2;
		this.amount = amount;
		this.dod = dod;
		this.duration = duration;
	}

}

