package Services;

import DataAccess.CustomerDal;

public class CustomerManager2 implements CustomerService {

	private CustomerDal customerDal;
		
	
	public void setCustomerDal(CustomerDal customerDal) {
		this.customerDal = customerDal;
	}


	@Override
	public void addCustomer() {
		this.customerDal.addCustomer();
		//System.out.println("das");
	}

}
