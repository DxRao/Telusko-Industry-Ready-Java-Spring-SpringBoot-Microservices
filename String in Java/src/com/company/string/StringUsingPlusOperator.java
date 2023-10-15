package com.company.string;

public class StringUsingPlusOperator {

	public static void main(String[] args) {
		
		String str1="Java";
		
		String str2="Ja";
		
		String str3="va";
		
		
		String str4=str2+str3;//java ... Using plus operator with reference variables
		
		System.out.println(str1==str4);//false
		
		String str5="DayakarRao";
		
		String str6="Dayakar"+"Rao"; // Using plus operator with String literals
		
		System.out.println(str5==str6);//true
		

	}

}
