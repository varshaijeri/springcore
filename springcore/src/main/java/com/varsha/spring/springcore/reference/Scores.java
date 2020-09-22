package com.varsha.spring.springcore.reference;

public class Scores {
	private Double math;
	private Double science;
	private Double physics;

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	public Double getScience() {
		return science;
	}

	public void setScience(Double science) {
		this.science = science;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "Scores [math=" + math + ", science=" + science + ", physics=" + physics + "]";
	}
	
}
