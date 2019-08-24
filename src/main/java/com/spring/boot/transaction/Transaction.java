package com.spring.boot.transaction;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "transaction2")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int fromAcc;
    private int toAcc;
    private int amount;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromAcc() {
        return fromAcc;
    }

    public void setFromAcc(int fromAcc) {
        this.fromAcc = fromAcc;
    }

    public int getToAcc() {
        return toAcc;
    }   
    public void setToAcc(int toAcc) {
        this.toAcc = toAcc;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", fromAcc=" + fromAcc + ", toAcc=" + toAcc + ", amount=" + amount + ", date="
                + date + "]";
    }

}

