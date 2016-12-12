package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args){
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"config/spring/applicationContext-Customer.xml"});
		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
		cust.printName();
		cust.printURL();
	}
}
