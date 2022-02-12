package com.classes;

import org.springframework.stereotype.Component;

@Component("customerDal")
public class SqlServerCustomerDal implements CustomerDal {

	@Override
	public void addCustomer() {
		System.out.println("Customer Inserted Into Sql Server Database.");	
	}

}
