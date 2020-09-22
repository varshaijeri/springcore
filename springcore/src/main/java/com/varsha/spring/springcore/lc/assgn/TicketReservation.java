package com.varsha.spring.springcore.lc.assgn;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void initialize() {
		System.out.println("inside init method: hi!!!");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("inside destroy method: bye!!!!");
	}

	@Override
	public String toString() {
		return "Ticket Reservation [id=" + id + "]";
	}
}
