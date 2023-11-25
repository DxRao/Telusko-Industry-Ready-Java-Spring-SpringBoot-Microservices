package com.company.fileInputOutput;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; // Tagged Interface with no body between {  }



class Employee1 implements Serializable{ // Implementing Serializable interface takes care of both Serialization and Deserialization

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
	}
	public void disp()
	{
		System.out.println("Id : " + id);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
public class SerializationDeserialization{


	public static void main(String[] args) { 
	
		Employee1 emp=new Employee1(1, "Ramesh", 18);
		//emp.disp();
		
		try{
		
			// Without using BufferedOutputStream and BufferedInputStream
			
					// Serialization
			
			  FileOutputStream fos=new FileOutputStream("D:\\Telusko\\InputOutput\\java.txt"); 
			  ObjectOutputStream oos=new ObjectOutputStream(fos); 
			  oos.writeObject(emp);			  
			  oos.close();
			  
			  		// Deserialization
			  
			  FileInputStream fis=new FileInputStream("D:\\Telusko\\InputOutput\\java.txt"); 
			  ObjectInputStream ois=new ObjectInputStream(fis);
			  
			  Employee1 e=(Employee1) ois.readObject(); 
			  System.out.println("Without using Buffered Streams");
			  e.disp();
			  
			  // By using BufferedOutputStream and BufferedInputStream
			  
			  		// Serialization
			  
			  FileOutputStream fos1=new FileOutputStream("D:\\Telusko\\InputOutput\\java1.txt"); 
			  BufferedOutputStream bos1=new BufferedOutputStream(fos1); 
			  ObjectOutputStream oos1=new ObjectOutputStream(bos1); 
			  oos1.writeObject(emp);
			  
			  oos1.close(); 
			  bos1.close();
			 
			  		// Deserialization
			  
			  FileInputStream fis1=new FileInputStream("D:\\Telusko\\InputOutput\\java1.txt"); 
			  BufferedInputStream bis1=new BufferedInputStream(fis1);
			  ObjectInputStream ois1=new ObjectInputStream(bis1);
			  
			  Employee1 e1=(Employee1) ois1.readObject();
			  System.out.println();
			  System.out.println("*****************************");
			  System.out.println("By using Buffered Streams");
			  e1.disp();
			 
			  bis1.close();
			  ois1.close();
			 	
		} 
		
		catch (Exception e){ 		
			
			e.printStackTrace();
		}
	}
}

