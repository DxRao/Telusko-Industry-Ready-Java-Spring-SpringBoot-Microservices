package com.company.springprojects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator {
	
	@Autowired
	CasioCalculator casiocalc;
	
	public int add(int x, int y) {
		
		return casiocalc.add(x, y) ;
		
	}

}
