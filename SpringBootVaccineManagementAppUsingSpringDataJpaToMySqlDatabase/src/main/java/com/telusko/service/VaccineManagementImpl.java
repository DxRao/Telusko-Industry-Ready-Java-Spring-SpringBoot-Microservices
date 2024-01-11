package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.VaccineDetails;
import com.telusko.dao.IVaccineRepo;

@Service
public class VaccineManagementImpl implements IVaccineManagement {

	@Autowired
	private IVaccineRepo repo;
	
	@Override
	public String registerVaccineDetails(VaccineDetails vaccine) 
	{
		System.out.println("Implementing class of IVaccineRepo is : "+repo.getClass().getName());
		VaccineDetails v = repo.save(vaccine);
		return "Vaccine Details Registered with id "+ v.getId();
	}

	@Override
	public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccineList) {
		return repo.saveAll(vaccineList);
		
	}

	@Override
	public Long getVaccinesCount() {
		return repo.count();
		
	}

	@Override
	public Boolean checkAvailability(Long id) {
		
		return repo.existsById(id);
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccineInfo() {
		
		return repo.findAll(); 
	}

	@Override
	public Iterable<VaccineDetails> getAllVaccineInfoByIds(Iterable<Long> idList) {
		
		return repo.findAllById(idList);
	}

}
