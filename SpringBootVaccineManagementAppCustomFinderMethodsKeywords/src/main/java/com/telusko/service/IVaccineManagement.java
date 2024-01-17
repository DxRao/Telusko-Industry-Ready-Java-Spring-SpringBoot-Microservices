package com.telusko.service;

import java.util.Collection;
import java.util.List;

import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{
	 public List<VaccineDetails> searchByVaccinePrice(Integer price);
	 public List<VaccineDetails> searchByCompanyName(String companyName);
	 
	 public List<VaccineDetails> searchByPriceLessThan(Integer price);
     
	   public List<VaccineDetails> searchByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer 
			   staringPrice, Integer endPrice);
}
