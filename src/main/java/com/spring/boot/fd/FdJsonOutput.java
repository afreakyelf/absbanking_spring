package com.spring.boot.fd;

import java.util.List;

public class FdJsonOutput {

	private List<FixedDeposit> fdList;

	public List<FixedDeposit> getfd() {
		return fdList;
	}

	public void savefd(List<FixedDeposit> fdList) {
		this.fdList = fdList;
	}

}
