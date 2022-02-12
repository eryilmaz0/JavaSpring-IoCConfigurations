package DataAccess;

public class SqlServerCustomerDal implements CustomerDal {

	@Override
	public void addCustomer() {
		System.out.println("Customer Inserted Into Sql Server Database.");	
	}

}
