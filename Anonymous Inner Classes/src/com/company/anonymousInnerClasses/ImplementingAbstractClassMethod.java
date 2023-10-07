package com.company.anonymousInnerClasses;

abstract class ABC{
	
	void show1() {
		
		System.out.println("in show1() method");
	}
	
	abstract void show2();	
}

public class ImplementingAbstractClassMethod {

	public static void main(String[] args) {
		
		ABC abc = new ABC() { // Implementation of show2() method of abstract class ABC thru Anonymous inner class
			
			void show2() {
				
				System.out.println("in show2() method");
			}
			
		};
		
		abc.show1();
		
		abc.show2();
	}
}

/*
 * in show1() method 
 * in show2() method
 */