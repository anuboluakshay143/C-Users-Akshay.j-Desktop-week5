package com.codeBasesdAssessment2;

public abstract class Demo {
	abstract void abstractdemo();

	final void display() {
		System.out.println("This is final ");
	}

	public  void abstractbasics(int a,int b) {
	
	
		int result = a + b;
		System.out.println("Addition of Two Numbers=" + result);

	}

	static void method(int c, int d) {
		int res = c - d;
		System.out.println("Sub of Two Numbers is=" + res);
	}
}
