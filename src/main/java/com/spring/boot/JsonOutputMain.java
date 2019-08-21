package com.spring.boot;

import java.util.List;

public class JsonOutputMain {

	private List<MainPojo> mlist;

	public List<MainPojo> getList() {
		return mlist;
	}

	public void setList(List<MainPojo> list) {
		this.mlist = list;
	}
	
}

class BalanceOutput{
    private String balance;

    public String getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = String.valueOf(balance);
    }
    
}


class IsUserExist{
    private Boolean isExist = false;
    private String phone;
 

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getIsExist() {
		return isExist;
	}

	public void setIsExist(Boolean isExist) {
		this.isExist = isExist;
	}

   
    
}
