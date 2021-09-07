package com.spring.Ambiguity;

public class Addition {

	private int a;
	private int b;

	public Addition(double a, double b) {

		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor: double");
	}

	public Addition(int a, int b) {

		this.a = a;
		this.b = b;
		System.out.println("constructor: integer");
	}

	public void doSum() {
		System.out.println(this.a + this.b);

	}

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

}
