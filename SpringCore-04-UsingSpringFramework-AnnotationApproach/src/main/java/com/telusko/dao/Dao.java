package com.telusko.dao;

import org.springframework.stereotype.Repository;

@Repository(value="repo")
public class Dao //dao
{
     public Dao()
     {
    	 System.out.println("dao obj is created");
     }
}
