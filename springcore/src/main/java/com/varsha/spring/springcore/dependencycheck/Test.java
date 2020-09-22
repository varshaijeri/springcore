package com.varsha.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springcore/dependencycheck/config.xml");
		Prescription pres = (Prescription)ctx.getBean("pres");
		System.out.println(pres);
	}

}
