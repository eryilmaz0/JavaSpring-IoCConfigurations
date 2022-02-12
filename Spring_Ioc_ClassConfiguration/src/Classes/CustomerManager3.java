package Classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("customerService")
public class CustomerManager3 implements CustomerService {
	@Value("${database.connection}")
	private String databaseConnection;
	
	@Value("${database.username}")
	private String databaseUserame;
	
	@Value("${database.password}")
	private String databasePassword;
	
	
	private CustomerDal[] customerDals;

	public CustomerManager3(CustomerDal[] customerDals) {
		this.customerDals = customerDals;
	}

	
	@Override
	public void addCustomer() {
		System.out.println("Database Information :");
		System.out.println("Database Connection :" +this.databaseConnection);
		System.out.println("Database Username :" +this.databaseUserame);
		System.out.println("Database Password :" +this.databasePassword);
		
		for(var customerDal:this.customerDals) {
			customerDal.addCustomer();
		}
		
	}

}
