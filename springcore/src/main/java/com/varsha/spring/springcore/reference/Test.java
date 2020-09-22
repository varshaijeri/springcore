package com.varsha.spring.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springcore/reference/config.xml");
		Student student = (Student)ctx.getBean("student");
		System.out.println(student);
	}

}
