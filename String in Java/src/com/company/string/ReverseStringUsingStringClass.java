package com.company.string;

public class ReverseStringUsingStringClass {

	public static void main(String[] args) {
		
		String s1 = "Telusko";
		
		String s2 = "";
		
		for(int i = (s1.length()-1); i >= 0; i--) {
			
			s2 = s2 + s1.charAt(i);	// Disadvantage: adding each character to the string creates multiple objects as String object is immutable.		
		}							// Recommended to use StringBuffer or StringBuilder class as its mutable
		
		System.out.println(s2);			
	}
}