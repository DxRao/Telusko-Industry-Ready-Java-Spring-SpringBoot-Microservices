package com.company.anonymousInnerClasses;

interface XYZ{
	
	void show1(); 
	void show2();	
}

public class ImplementingInterfaceAbstractMethod {

	public static void main(String[] args) {
		
		XYZ xyz = new XYZ() { // Implementation of show2() method of abstract class ABC thru Anonymous inner class
			
			public void show1() { // public is a must for implementing public abstract method of interface
				
				System.out.println("in show1() method");
			}
			
			public void show2() { // public is a must for implementing public abstract method of interface
				
				System.out.println("in show2() method");
			}
			
		};
		
		xyz.show1();
		
		xyz.show2();
	}
}

/*
 * in show1() method 
 * in show2() method
 */