package com.company.anonymousInnerClasses;

class P{
	
	void show() {
		
		System.out.println("in class P show()");
	}
	
	void show1() {
		
		System.out.println("in class P show1()");
	}
}
	

/*
 * class Q1 extends P{ void show() { System.out.
 * println("Purpose of class Q is to override the P class show() method"); } }
 */

public class OverridingNormalClassMethod {

	public static void main(String[] args) {
		
		
		  //Q1 obj = new Q1();  // OR		  
		  //P obj = new Q1();	
		  //obj.show();
		
		P obj = new P() {// Object instance of anonymous inner class without a class name
			
			void show() { // must have a same name method in class P to override
				System.out.println("Purpose of anonymous inner class is to override the P class show() method");
			}
			
			void show1() { // must have a same method in P class to override
				System.out.println("in show1" );
			}
			
			void show2() { // you can have a local method but you can't call or use it(only a warning from compiler)
				System.out.println(" In show2() method");
			}
		};		
		
		obj.show();	
		obj.show1();
		//obj.show2(); // Compile Time error: The method show2() is undefined for type P		
	}
}
