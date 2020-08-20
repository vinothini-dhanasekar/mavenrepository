package com.cg.test;
import org.junit.Assert;
import org.junit.Test;

import com.cg.exception.MinimumBalanceException;
import com.cg.model.Address;
import com.cg.model.Customer;
import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;

public class TestBank {
	public BankService bank;
	
	
	
	public TestBank() {
		bank = new BankServiceImpl();
	}
	@Test(expected=MinimumBalanceException.class)
	public void checkAccountCreation() throws MinimumBalanceException
	{
	Customer customer = new Customer();
	customer.setCustID(101);
	customer.setCustName("Amir");
	customer.setCustAddress(new Address("Erode","Tamilnadu"));
	bank.createAccount(customer,500);
	
}
}