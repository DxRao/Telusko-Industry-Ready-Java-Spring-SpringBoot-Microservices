package com.company.springprojects;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CasioCalculator {
	
	public int add(int a, int b) {	
		
		return a + b;		
	}
}
