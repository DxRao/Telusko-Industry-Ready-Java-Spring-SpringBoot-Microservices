package com.company.lamdaExpression;

@FunctionalInterface
interface Mobile{
	
	void disp();
}

class IPhone implements Mobile{
	
	@Override	
	public void disp() {
		System.out.println("IPhone is an expensive fancy phone");
	}
}

public class FuntionalInterfaceLamdaExpression {

	public static void main(String[] args) {
		
		IPhone obj = new IPhone();
		
		obj.disp();
		
		/*
		// implementation of abstract disp() method of Mobile interface through Anonymous inner class
		
		Mobile ph = new Mobile(){
			
			public void disp() {
				
				System.out.println("Google phone also is very expensive");
			}			
		};
				
		*/
		
		// Alternatively, functional interface can be implemented through Lamda Expression
		// No class file is created in Lamda Expression for inner class
		
		Mobile ph = ()->System.out.println("Google phone also very expensive one"); // implementation of disp() method
		
		ph.disp(); //Overriding of disp() method of Mobile interface
		
	} 
}
