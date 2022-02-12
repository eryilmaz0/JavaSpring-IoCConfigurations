package Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.classes.CustomerService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Application Started.");	
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IoCConfiguration.xml");
		CustomerService customerService = context.getBean("customerService", CustomerService.class);
		customerService.addCustomer();
	}

}
