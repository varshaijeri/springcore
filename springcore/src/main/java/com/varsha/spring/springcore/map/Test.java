package com.varsha.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springcore/map/customerMap.xml");
		Customer cus = (Customer)ctx.getBean("cus");
		System.out.println(cus);
	}

}
