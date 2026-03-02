package com.sana;
import java.util.*;
class Student{
	private String name;
	private int marks;
	
	//constructor
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	//getter
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(int marks){
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);
		
	}	
}


public class Day4OOP {

	public static void main(String[] args) {
	
		Student s1 = new Student("Sana", 33);
		s1.display();
		
		s1.setMarks(44);
		System.out.println("Updated Marks : " + s1.getMarks());
		
		
		

	}

}
