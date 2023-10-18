package com.company.string;

public class FinalKeywordOnSB {

	public static void main(String[] args) {
		
		final StringBuffer sb=new StringBuffer("Java");
		
		sb.append(" is Best"); // final Keyword has no effect on changing value of the object as it's still mutable object. 
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		//sb=new StringBuffer("Telusko"); // final Keyword doesn't allow change in ref address
										// Compile error
		
		//System.out.println(sb);
	}
}
