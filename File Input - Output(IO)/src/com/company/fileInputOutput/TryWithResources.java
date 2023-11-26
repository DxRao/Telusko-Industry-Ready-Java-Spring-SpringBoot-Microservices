package com.company.fileInputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class Alien implements AutoCloseable{

	@Override
	public void close() throws Exception {	
		
		System.out.println("Close method of alien resource is invoked");
	}	
}

public class TryWithResources {


	public static void main(String[] args) throws Exception {
	
		
		try(Alien a=new Alien()){		
			
			System.out.println("Using Alien resource");
		}
	
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Telusko\\InputOutput\\java2.txt"))){
			
			bw.write("Alien");
			bw.newLine();
			bw.write(65);
			bw.write("\n");	// same as bw.newLine();
			bw.write("Java");
			
			bw.flush();
			
			System.out.println("Check java2.txt file");				
		}
		catch(Exception e){
		
			System.out.println("Some exception w.r.t IO");
		}

	}

}

