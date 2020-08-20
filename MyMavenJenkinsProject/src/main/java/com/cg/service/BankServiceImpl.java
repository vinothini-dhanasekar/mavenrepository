package com.cg.service;

import com.cg.exception.MinimumBalanceException;
import com.cg.model.Customer;
import com.cg.model.Account;

public class BankServiceImpl implements BankService {

	public Account createAccount(Customer customer, int i) throws MinimumBalanceException {
		// TODO Auto-generated method stub
	if(customer == null)
	{
		throw new IllegalArgumentException("Customer not availabl");
	}
	if (i < 1000)
	{
		throw new MinimumBalanceException("Minimum Balance must be 1000");
	}
	Account acc = new Account();
	acc.setAccountId(101);
	acc.setBalance(i);
	acc.setCustomer(customer);
	return acc;
	}

}
