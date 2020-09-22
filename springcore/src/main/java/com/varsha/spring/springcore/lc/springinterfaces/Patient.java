package com.varsha.spring.springcore.lc.springinterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside after prop set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside detroy");
	}
}
