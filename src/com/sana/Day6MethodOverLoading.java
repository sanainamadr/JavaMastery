package com.sana;

public class Day6MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calc = new Calculation();
		System.out.println(calc.sum(1,1));
		System.out.println(calc.sum((float)1.2,(float)1.1));
		System.out.println(calc.sum(1,1,2));
	}

}

class Calculation {
	int sum(int a, int b) {
		return a+b;
	}
	float sum(float a, float b) {
		return a+b;
	}
	int sum(int a, int b, int c) {
		return a+b+c;
	}
}
