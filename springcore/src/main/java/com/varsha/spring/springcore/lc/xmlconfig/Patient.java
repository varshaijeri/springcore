package com.varsha.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	//init method
	public void hi() {
		System.out.println("inside init method: hi!!!");
	}
	//destroy
	public void bye() {
		System.out.println("inside destroy method: bye!!!!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
