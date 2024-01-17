package com.telusko.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.bo.VaccineDetails;

public interface IVaccineRepo extends JpaRepository<VaccineDetails, Long> 
{
	//findByProperty
   public List<VaccineDetails> findByPrice(Integer price);
   
   	//public List<VaccineDetails> findByVaccineCompany(String companyName);
//   public List<VaccineDetails> findByVaccineCompanyIs(String companyName);
   public List<VaccineDetails> findByVaccineCompanyEquals(String companyName);
   //findByPropertykeyword
   public List<VaccineDetails> findByPriceLessThan(Integer price);
   
   
   //findBypropertykeywordpropertykeyword
   public List<VaccineDetails> findByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer 
		   staringPrice, Integer endPrice);
   
   
}
