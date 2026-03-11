package com.sana;

public class Day5Inheritance {

	public static void main(String[] args) {
		
		
		Fish shark = new Fish();
		shark.eat();
		
		Animal all = new Animal();
		all.breath();
			
	}

}

class Animal{
	String color;
	
	void eat() {
		System.out.print("Eats");
	}
	void breath() {
		System.out.print("Breath");
	}
}

class Fish extends Animal{
	int fin;
	
	void swim() {
		System.out.print("Swimming...");
	}
}



