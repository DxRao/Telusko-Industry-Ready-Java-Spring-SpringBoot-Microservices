package com.company.innerClasses;

class A1{ // can't be static
	
	int num; // variable can be static
	
	A1(){
		
	}
	void show() { // methods can be static
		
		System.out.println("In class A1 show");
	}
	static class B{ // Only inner classes can be static and not the outer class A
		
		int x;
		
		void something() {
			
			System.out.println("In class B something() method");
		}		
	}	
}
public class InnerClassStatic {

	public static void main(String[] args) {
		
		A1 obj = new A1(); // obj is an Object of class A
		
		obj.show();
		
		obj.num = 10;
		
		System.out.println(obj.num);
		
		A1.B obj1 =  new A1.B(); // OR 
		//A1.B obj1 = new A1.B(); // obj1 is an Object of class B
		
		obj1.something(); // method call to class B method is same whether B class is static or non-static
		
		obj1.x = 20; //Accessing class B variable is same whether B class is static or non-static		
		
		System.out.println(obj1.x);
	}
}

/* OUTPUT:
  
In class A1 show
10
In class B something() method
20 

 */
