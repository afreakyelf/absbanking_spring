package com.spring.boot.fd;

import java.util.List;

public class FdJsonOutput {

	private List<FixedDeposit> fdList;

	public List<FixedDeposit> getAll() {
		return fdList;
	}

	public void saveAll(List<FixedDeposit> fdList) {
		this.fdList = fdList;
	}

}
