package com.varsha.spring.springcore.assgn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springcore/assgn/config.xml");
		ShoppingCart sc = (ShoppingCart)ctx.getBean("sc");
		System.out.println(sc);
	}

}
