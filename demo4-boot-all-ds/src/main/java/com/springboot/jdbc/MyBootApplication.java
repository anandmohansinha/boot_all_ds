package com.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyBootApplication implements CommandLineRunner{

	@Autowired
	CustomerDAO custDAO;
	
	@Autowired
    private ApplicationContext appContext;

	
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {

		//List<Customer> customers = custDAO.getAllCustomers1();
		//customers.forEach(myCust -> System.out.println(myCust.getCname()));
		
		
		//List<Customer> customersByCity = custDAO.getCustomerByCity("bangalore");
		//customersByCity.forEach(myCust -> System.out.println(myCust.getCname()));
		
		Customer cust = new Customer(10, "Hari", "hari@gmail.com", 9999, "US");
		custDAO.addCustomer(cust);

		
	}

}
