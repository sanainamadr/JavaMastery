package com.sana;

public class Day7_Abstraction {

	public static void main(String[] args) {
		
		Hourse h = new Hourse();
		h.eat();
		h.walk();
		
		Chicken c = new Chicken();
		h.eat();
		c.walk();
		

	}

}

abstract class Animal{
	void eat() {
		System.out.println("Animal eatssss");
	}
	abstract void walk();
}

class Hourse extends Animal{
	void walk() {
		System.out.println("hourse walks on 4 legs ");
	}
}

class Chicken extends Animal{
	void walk() {
		System.out.println("Chicken walks on 2 legs ");
	}
}
