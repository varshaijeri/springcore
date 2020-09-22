package com.varsha.spring.springcore.dependencycheck.assgn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springcore/dependencycheck/assgn/config.xml");
		University uni= (University)ctx.getBean("uni");
		System.out.println(uni.hashCode()+"\n");
		System.out.println(uni);
		University uni2= (University)ctx.getBean("uni");
		System.out.println(uni2.hashCode()+"\n");
		System.out.println(uni2);
	}

}
