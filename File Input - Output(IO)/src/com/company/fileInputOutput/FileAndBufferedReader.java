package com.company.fileInputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileAndBufferedReader {


	public static void main(String[] args) throws IOException{ 
	
		FileReader reader=null; // Must for File Reading
		BufferedReader br=null; // Optional for efficient Reading purposes
		String path1="D:\\Telusko\\InputOutput";
		
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");			
			
			reader=new FileReader(file);
			br=new BufferedReader(reader);
			
			String str = br.readLine(); // Read one line at a time
			
			while(str != null)
			{
				System.out.println(str); // Print one line at a time
				
				str=br.readLine();
			}			
		}
		catch(Exception e)
		{
			System.out.println("Some exception w.r.t IO");
		}
		finally
		{
			reader.close();
			br.close();
		}
	}
}
