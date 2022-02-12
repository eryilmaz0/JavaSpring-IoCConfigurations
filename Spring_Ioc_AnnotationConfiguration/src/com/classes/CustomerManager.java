package com.classes;

import org.springframework.stereotype.Component;

@Component("customerService")
public class CustomerManager implements CustomerService {

	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	@Override
	public void addCustomer() {
		this.customerDal.addCustomer();
		//System.out.println("Customer Added.");
	}

}
