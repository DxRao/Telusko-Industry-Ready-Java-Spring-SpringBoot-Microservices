package com.company.innerClasses;

class A{
	
	int num;
	
	A(){
		
	}
	void show() {
		
		System.out.println("In class A show");
	}
	class B{
		
		int x;
		
		void something() {
			
			System.out.println("In class B something() method");
		}		
	}	
}
public class InnerClassNonStatic {

	public static void main(String[] args) {
		
		A obj = new A(); // obj is an Object of class A
		
		obj.show();
		
		obj.num = 10;
		
		System.out.println(obj.num);
		
		A.B obj1 = new A().new B(); // OR 
		//A.B obj1 = obj.new B(); // obj1 is an Object of class B
		
		obj1.something(); // method call to class B method.
		
		obj1.x = 20;
		
		System.out.println(obj1.x);
	}
}

/* OUTPUT:
  
In class A show
10
In class B something() method
20 

 */
