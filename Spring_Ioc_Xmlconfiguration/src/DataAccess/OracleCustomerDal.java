package DataAccess;

public class OracleCustomerDal implements CustomerDal {

	@Override
	public void addCustomer() {
		System.out.println("Customer Inserted Into Oracle Database.");	
	}

}
