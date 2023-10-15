package com.company.string;

public class StringNewObjectCreation {

	public static void main(String[] args) {
		
		final int age=10; 
		//age=20; // Same variable ... value can't be changed.
		
		String str1="Telusko";
		
		System.out.println(str1);
		
		str1=str1.concat(" Java"); // New Object created in Heap area with value changed to "Telusko Java".
		
		System.out.println(str1);


	}

}
