package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringBootVaccineManagementAppExtendingJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVaccineManagementAppExtendingJpaRepositoryApplication.class, args);
	
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);

		VaccineDetails vaccine=new VaccineDetails("Covaxin", "BharatBiotech", 4345);
//		service.searchVaccineByGivenData(vaccine, true, "vaccineName", "vaccineCompany").
//		forEach(v->System.out.println(v.getVaccineName() + " : "+ v.getVaccineCompany()));
	
//		service.searchVaccineByGivenObject(vaccine).forEach(v->System.out.println(v));
		
//		System.out.println(service.searchVaccineById(2L));
		
		List<Long> ids=new ArrayList<>();
		ids.add(4L); // Available in database
		ids.add(7L); // not available in database
		ids.add(8L); // not available in database
		
		System.out.println(service.removeVaccineByIds(ids)); // deleted 4L

		
		context.close();
	}

}
