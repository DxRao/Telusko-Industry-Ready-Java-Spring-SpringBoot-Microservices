package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.dao.SpringJdbc;

@Component
public class StudentCommandLineRunner implements CommandLineRunner 
{
    @Autowired
	private SpringJdbc springJdbc;
	
	@Override
	public void run(String... args) throws Exception 
	{
		springJdbc.insert();

	}

}
