package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
		
		@Override
		public Optional<VaccineDetails> getVaccineById(Long id) {
			return  repo.findById(id) ;
			
		}

		@Override
		public String removeVaccineById(Long id) {
			Optional<VaccineDetails> optional = repo.findById(id);
			if(optional.isPresent())
			{
				repo.deleteById(id);
			return "Record deleted";
			}
					
			return "There is no record with id" + id;
		}

		@Override
		public String removeVaccinesByIds(List<Long> ids) 
		{
			Iterable<VaccineDetails> list = repo.findAllById(ids);
			int count=ids.size();
			if(count==((List)list).size())
			{
			      repo.deleteAllById(ids);
			      return count + " Num of rows deleted";
			}
			return "Some problem to delete records";
		}

		@Override
		public String removeVaccineByObject(VaccineDetails vaccine) {
			
			Optional<VaccineDetails> vaccinInfo = repo.findById(vaccine.getId());
			
			if(vaccinInfo.isPresent())
			{
			repo.delete(vaccine);
			return "Given vaccine Object record deleted";
			}
			return "Record not found to delete";
	}

}
