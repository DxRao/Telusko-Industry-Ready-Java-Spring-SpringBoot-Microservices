package com.company.fileInputOutput;

import java.io.*;

public class FileReading 
{

	public static void main(String[] args) throws IOException 
	{
		FileReader reader=null;
		String path1="D:\\Telusko\\InputOutput";
		
		try
		{
			File directory=new File(path1);
			File file=new File(directory,"java.txt");
			
			reader=new FileReader(file);
			
//			int i = reader.read(); // reads first character ... returns ASCII value in int

//			while(i != -1)
//			{
//				System.out.println(i + " --> " + (char)i); // converts ASCII to character
//				i = reader.read(); // reads from second character onwards
//			}
			
			char c = (char)reader.read(); // reads first character
			
			System.out.println(c);
			
			int size = (int)file.length(); //returns long by default ... need to downcast to int
			
			//System.out.println(size);
			
			char cArray[] = new char[size-1]; // reads from second character ... so size-1 
			
			reader.read(cArray);// reads from second character into cArray
			
			for(char cr : cArray)
			{
				System.out.println(cr);
			}			
		}
		catch(Exception e)
		{
			System.out.println("Some exception w.r.t IO");
		}
		finally
		{
			reader.close();
		}
	}
}
