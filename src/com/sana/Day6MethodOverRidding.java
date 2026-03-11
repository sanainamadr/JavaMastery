package com.sana;

public class Day6MethodOverRidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d = new Deer();
		d.breath(); 
	}

}

class Animal {
	void eat() {
		System.out.print("Eatssssss");
	}
}
class Deer extends Animal{
	void breath() {
		System.out.print("Breathhhhh");
	}
}