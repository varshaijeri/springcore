package com.varsha.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("setConfig.xml");
		CarDealer cd = (CarDealer)ctx.getBean("car");
		System.out.println("Info: "+cd.getName()+"\n models: "+cd.getModels());
	}

}
