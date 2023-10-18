package com.company.arrayPrograms;

class Student{
	
	String name;
	
	int age;
	
	double marks;
	
	public Student(String name, int age, double marks){
		
		this.name = name;
		this.age = age;
		this.marks = marks;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Student[] starr = new Student[3];
		
		starr[0] = new Student("Rohit", 21, 89.00);
		starr[1] = new Student("Anil", 26, 79.50);
		starr[2] = new Student("Swarna", 22, 93.75);
		
		
		for( Student array:starr) {
			
			System.out.println(array);// Printing Student data by overriding toString() method of default parent Object class.
		}
		
		for( Student array:starr) {// Printing Student data directly without overriding the toString() method.
			
			System.out.print(array.name + " ");
			System.out.print(array.age + " ");
			System.out.println(array.marks);
		}
	}
}
