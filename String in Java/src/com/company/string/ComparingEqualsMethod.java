package com.company.string;

public class ComparingEqualsMethod { // Comparing the output of String.equals() Vs StringBuffer/Builder.equals() methods

	public static void main(String[] args) {
		
		String s1 = "Telusko";
		String s2 = "Telusko";
		
		StringBuffer s3 = new StringBuffer("Telusko");
		StringBuffer s4 = new StringBuffer("Telusko");
		
		System.out.println(s1 == s2); // returns true as both object reference variables hold same address in SCP pointing to same object.. 
		System.out.println(s1.equals(s2)); // returns true as both object reference variables point to same object with value "Telusko" 
		
		// In String class -> equals() method is made to override equals() method of its parent Object class 
		//to change the behavior to comparing values rather than comparing addresses of two reference variables.
	
		///////////////////////////
		
		System.out.println(s3 == s4); // returns false as both object reference variables pointing to two different objects and different addresses in Heap area. 
		System.out.println(s3.equals(s4)); // returns false as equals method here compares both object reference variable addresses rather than values in those objects. 
		
		// In StringBuffer/Builder class -> equals() method is not made to override equals() method of its parent Object class 
		//so its comparing addresses of two reference variables rather than the values of objects they are pointing contrary to equals() method of String class.
	
	}
}

/*
 * true 
 * true 
 * false 
 * false
 */
