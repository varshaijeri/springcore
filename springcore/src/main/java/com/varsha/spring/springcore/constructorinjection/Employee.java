package com.varsha.spring.springcore.constructorinjection;

public class Employee {
	private int id;
	private Address addr;
	
	Employee(int id,Address addr){
		this.id = id;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", addr=" + addr + "]";
	}
}
