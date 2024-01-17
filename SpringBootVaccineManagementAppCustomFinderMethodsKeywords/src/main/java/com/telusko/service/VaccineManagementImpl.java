package com.telusko.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement {

	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<VaccineDetails> searchByVaccinePrice(Integer price) {
		System.out.println("My CustomFinder method implemented by " + repo.getClass().getName());
		
		List<VaccineDetails> list =repo.findByPrice(price);
	

		return list;	
	}

	@Override
	public List<VaccineDetails> searchByCompanyName(String companyName) {
//		return repo.findByVaccineCompany(companyName);
		//return repo.findByVaccineCompanyIs(companyName);
		return repo.findByVaccineCompanyEquals(companyName);
		
		
	}

	@Override
	public List<VaccineDetails> searchByPriceLessThan(Integer price) {
	
		return  repo.findByPriceLessThan(price);
	}

	@Override
	public List<VaccineDetails> searchByVaccineNameInAndPriceBetween(Collection<String> vaccines, Integer staringPrice,
			Integer endPrice) {
		
		return repo.findByVaccineNameInAndPriceBetween(vaccines, staringPrice, endPrice);
	}
	
	
}
