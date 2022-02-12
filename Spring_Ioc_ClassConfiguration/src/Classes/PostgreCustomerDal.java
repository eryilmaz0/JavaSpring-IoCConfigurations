package Classes;

import org.springframework.stereotype.Component;

//@Component("customerDal")
public class PostgreCustomerDal implements CustomerDal {

	@Override
	public void addCustomer() {
		System.out.println("Customer Inserted Into Postgre Database.");		
	}

}
