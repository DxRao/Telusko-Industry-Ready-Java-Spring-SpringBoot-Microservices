package com.company.string;

public class StringIntArrayAsArgument {

	public static void main(String[] args) {
		
		int[] ascii = {65, 66, 67, 68};	
		
		String s = new String(ascii, 1, 3); // array[], int start_index, int length of string
		
		System.out.println(s); // Output: BCD ... B at index 1 and length of string is 3 ie... BCD
		
		String x = new String(ascii, 1, 2); // array[], int start_index, int length of string
		
		System.out.println(x); // Output: BC ... B at index 1 and length of string is 2 ie... BC
		
		String y = new String(ascii, 0, 4); // array[], int start_index, int length of string
		
		System.out.println(y); // Output: ABCD ... A at index 0 and length of string is 4 ie... ABCD
	}
}

/*
  
BCD
BC
ABCD

*/

