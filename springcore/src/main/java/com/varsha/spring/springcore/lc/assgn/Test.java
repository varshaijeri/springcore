package com.varsha.spring.springcore.lc.assgn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springcore/lc/assgn/config.xml");
		TicketReservation tr = (TicketReservation)ctx.getBean("tr");
		System.out.println(tr);
		ctx.registerShutdownHook();
	}

}
