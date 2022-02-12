package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Classes.CustomerService;
import Config.IoCConfig;

public class Main {

	public static void main(String[] args) {
		System.out.println("Application Started.");
		
		var context = new AnnotationConfigApplicationContext(IoCConfig.class);
		
		CustomerService customerService = context.getBean("getCustomerService", CustomerService.class);
		customerService.addCustomer();

		var customerService2 = context.getBean("getCustomerService3", CustomerService.class);
		customerService2.addCustomer();
	}

}
