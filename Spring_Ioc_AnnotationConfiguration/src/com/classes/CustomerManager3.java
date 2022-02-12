package com.classes;

import org.springframework.stereotype.Component;

//@Component("customerService")
public class CustomerManager3 implements CustomerService {

	@Override
	public void addCustomer() {
		System.out.println("Customer Service 3");
		
	}

}
