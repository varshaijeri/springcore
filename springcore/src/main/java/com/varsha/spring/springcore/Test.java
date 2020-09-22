package com.varsha.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("config.xml");
		//Employee emp = (Employee) ctx.getBean("emp");
		Hospital hos = (Hospital) ctx.getBean("hos");
		//System.out.println("Info: "+emp.getId()+ "  "+ emp.getName());
		System.out.println("Info: "+hos.getName()+ "  \nDepartments: "+ hos.getDepartments());
	}

}
