package com.company.fileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter1 { // PrintWriter is a class name and hence a reserved word


	public static void main(String[] args) throws FileNotFoundException {
	
		
			File file=new File("D:\\Telusko\\InputOutput");
			File file1=new File(file,"java.txt");
			
			PrintWriter print = new PrintWriter(file1);
			
			print.println(true); //Here println() is a method of PrintWriter class
								// Where as in System.out.println() ... println()is a method of PrintStream class.
			print.println(14);
			print.println(44.5);
			print.println("Java");
			print.println('A');
		   
			print.close();
	}

}
