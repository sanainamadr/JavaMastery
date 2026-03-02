package com.sana;

public class Day5_MulilevelInheritance {
     public static void main(String[] args) {
    	 Mammals mee = new Mammals();
    	 mee.eat();
    	 mee.breath();
    	 mee.legs = 5;
    	 System.out.println(mee.getlegs());
    	 
    	 Dog doggy = new Dog();
    	 doggy.eat();
    	 doggy.legs = 4;
    	 System.out.println(doggy.getlegs());
    	 
     }
}

class Animals{
	String color;
	
	void eat() {
		System.out.println("Eatsss");
	}
	void breath() {
		System.out.println("Brethsss");
	}
}

class Mammals extends Animals{
	int legs;
	int getlegs() {
		return legs;
	}
}

class Dog extends Mammals {
	String breed;
}
