package com.spring.boot.transaction;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/transactions")
public class TransactionController {

	@Autowired
	TransactionRepository transactionRepo;

	@GetMapping(value = "/all", produces = "application/json")
	@ResponseBody
	public JsonOutput getAll() {
		List<Transaction> list = (List<Transaction>) transactionRepo.findAll();
		JsonOutput json = new JsonOutput();
		json.setList(list);
		return json;
	}

	@GetMapping(path = "/add")
	@ResponseBody
	String add(@RequestParam int amount, @RequestParam int from_acc, @RequestParam int to_acc) {

		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setFromAcc(from_acc);
		transaction.setToAcc(to_acc);
		Date date = new Date();
		transaction.setDate(date.toString());

		transactionRepo.save(transaction);

		addAmount(to_acc, Long.parseLong(String.valueOf(amount)));
		delAmount(from_acc, Long.parseLong(String.valueOf(amount)));

		return "success";
	}

	private void addAmount(int to_acc, long amount) {

		transactionRepo.addAmount(to_acc, amount);

	}

	private void delAmount(int from_acc, long amount) {

		transactionRepo.delAmount(from_acc, amount);

	}

	@GetMapping(path = "/findAcc", produces = "application/json")
	@ResponseBody
	JsonOutput getFindByName(@RequestParam int account) {
		JsonOutput json = new JsonOutput();

		List<Transaction> list = (List<Transaction>) transactionRepo.findbyacc(account);
		json.setList(list);

		return json;
	}

}
