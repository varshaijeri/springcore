package com.varsha.spring.springcore.constructorinjection.ambiguity;

public class Addition {
Addition(int a, int b){
	System.out.println("int Contructor...");
}
Addition(Double a, Double b){
	System.out.println("double Contructor...");
}
Addition(String a, String b){
	System.out.println("string Contructor...");
}
}
