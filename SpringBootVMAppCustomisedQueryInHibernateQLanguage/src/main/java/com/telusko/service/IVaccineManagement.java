package com.telusko.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{
	 public List<VaccineDetails> fetchVaccineByCompanyName(String company);
	 public List<VaccineDetails> fetchVaccineByCompanies(String comp1, String comp2);
	 
	
		public List<String> fetchVaccineByPriceRange(Integer min, Integer max);
		
		
		public List<Object[]> fetchVaccineDetailByVaccineName(String vac1, String vac2);
		
		public int changePriceByVaccine(Integer newPrice, String vaccineName);
		
		public int deleteVaccinesByPrice(Integer min, Integer max);
		
		public int insertVaccines(String vaccineName, String vaccineCompany, Integer price);
		
		public Date getSystemDateAndTime();

}
