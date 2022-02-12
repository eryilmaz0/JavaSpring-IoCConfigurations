package Services;

import DataAccess.CustomerDal;

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
