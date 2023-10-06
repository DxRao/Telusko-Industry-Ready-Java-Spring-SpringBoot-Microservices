package com.company.innerClasses;

class A1{ // Outer class can't be static
	
	int num; // variable can be static
	static int z; // static variable
	
	A1(){
		
	}
	void show() { // methods can be static if you want
		
		System.out.println("In class A1 show");
	}
	static class B{ // Only inner classes can use keyword static and not the outer classes like A
		
		 int x;
		
		void something() {
			
			//num = 33; // static class method can't access non static variable of class A
			z = 33; // static class method can access static variable of class A
			
			System.out.println("In class B something() method");
		}		
	}
	class C extends B{ // allowed
		
		void doSomething(){
			
			x = 44; // variable x is accessible in class C as its inherited.			
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

Purpose of anonymous inner class is to override the P class show() method
in show1

 */
