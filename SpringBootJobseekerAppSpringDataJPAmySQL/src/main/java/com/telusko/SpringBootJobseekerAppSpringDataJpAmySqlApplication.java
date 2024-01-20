package com.telusko;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.JobSeeker;
import com.telusko.service.JobSeekerServiceImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJobseekerAppSpringDataJpAmySqlApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJobseekerAppSpringDataJpAmySqlApplication.class, args);
	
		JobSeekerServiceImpl service = context.getBean(JobSeekerServiceImpl.class);
		
//		InputStream input=null;
//		FileReader reader=null;
//		byte image[]=null;
//		char textFile[]=null;
		
//		try 
//		{
//			 input=new FileInputStream("D:\\Images\\DRao2.JPG");
//			  image=new byte[input.available()];
//			  input.read(image);
			
//			 File file=new File("D:\\Images\\history1.txt");
//			 reader=new FileReader(file);
//			 textFile=new char[(int) file.length()];
//			 reader.read(textFile);
			 
//		} 
		
//		catch (FileNotFoundException e) 
//		{
		
//		e.printStackTrace();
//		}
//		catch (Exception e) 
//		{
		
//			e.printStackTrace();
//		}		
		
//		JobSeeker job=new JobSeeker("Alien" , "Bengaluru", image, textFile);
		
//		String status=service.registerJobSeeker(job);
//		System.out.println(status);
		
		
		
//		try {
//			reader.close();
//			input.close();
//		} catch (IOException e) {
			
//			e.printStackTrace();
//		}
		
		Integer id=1;
		Optional<JobSeeker> optional = service.getDetailsById(id);
		if(optional.isPresent())
		{
			try {
			JobSeeker job = optional.get();
			System.out.println(job.getId()+ " : "+ job.getName() + " "+ job.getCity());
			OutputStream output=new FileOutputStream("DRao2.JPG");
			output.write(job.getImage());
			output.flush();
			
			FileWriter writer=new FileWriter("history1.txt");
			writer.write(job.getTextFile());
			writer.flush();
			}
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			catch (Exception e) 
			{
			
				e.printStackTrace();
			}		
			
		}
		else
		{
			System.out.println("There is no record with the given id : "+ id);
		}		
		
		context.close();
	
	}
}
