package com.telusko.service;

import java.util.Collection;
import java.util.List;


import com.telusko.bo.VaccineDetails;
import com.telusko.view.View;

public interface IVaccineManagement 
{
	public  <T extends View>List<T> fetchByVaccineCompany(String companyName, Class<T> cls);
	
}
