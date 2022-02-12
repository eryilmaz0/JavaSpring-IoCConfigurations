package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import Classes.CustomerDal;
import Classes.CustomerManager;
import Classes.CustomerManager3;
import Classes.CustomerService;
import Classes.OracleCustomerDal;
import Classes.PostgreCustomerDal;
import Classes.SqlServerCustomerDal;

@Configuration
@ComponentScan("Classes")
@PropertySource("classpath:configs.properties")
public class IoCConfig {
	
	@Bean
	public CustomerDal getCustomerDal() {
		return new OracleCustomerDal();
	}
	
	
	@Bean
	public CustomerService getCustomerService() {
		return new CustomerManager(this.getCustomerDal());
	}
	
	@Bean
	public CustomerService getCustomerService3() {
		return new CustomerManager3(new CustomerDal[] {new OracleCustomerDal(), 
									new PostgreCustomerDal(), new SqlServerCustomerDal()});
	}

}
