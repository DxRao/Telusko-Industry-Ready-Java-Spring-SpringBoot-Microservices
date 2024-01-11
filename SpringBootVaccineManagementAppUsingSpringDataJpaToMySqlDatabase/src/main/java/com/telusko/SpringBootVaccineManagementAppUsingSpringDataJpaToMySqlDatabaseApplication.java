package com.telusko;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringBootVaccineManagementAppUsingSpringDataJpaToMySqlDatabaseApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVaccineManagementAppUsingSpringDataJpaToMySqlDatabaseApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		
//		VaccineDetails vaccine=new VaccineDetails("Covaxin", "BharatBiotech", 4345);
//		String message=service.registerVaccineDetails(vaccine);
//		System.out.println(message);
		
//		List<VaccineDetails> vaccineList=new ArrayList<>();
//		vaccineList.add(new VaccineDetails("CoviShield", "Astrazenka", 4645));
//		vaccineList.add(new VaccineDetails("Moderna", "Pfizer", 4544));
//		vaccineList.add(new VaccineDetails("Sputnik", "RussianCompany", 4454));
	
//		service.registerMultipleVaccineDetails(vaccineList);
//		System.out.println("Check your db");
		
//		Long count=service.getVaccinesCount();
//		System.out.println("Number of vaccines in DB table : "+ count);
		
		System.out.println("******************************");

		Long id=2l; // l for long
		Boolean status=service.checkAvailability(id);
		if(status)
			System.out.println("Vaccine available with id : "+ id);
		else
			System.out.println("Vaccine not available with id "+ id);
		
		id=9l;
		status=service.checkAvailability(id);
		if(status)
			System.out.println("Vaccine available with id : "+ id);
		else
			System.out.println("Vaccine not available with id "+ id);
		
		/////////////////////////////////////////////////////////
		
//		Iterable<VaccineDetails> vaccineInfo=service.getAllVaccineInfo();
		
//		vaccineInfo.forEach((vaccines)->System.out.println(vaccines));
		
		//  OR
		
//		List<VaccineDetails> vaccineInfoList=(List<VaccineDetails>) service.getAllVaccineInfo(); // Explicit casting
		
//		vaccineInfoList.forEach((vaccines)->System.out.println(vaccines));
		
		//  OR
		
//		service.getAllVaccineInfo().forEach((vaccines)->System.out.println(vaccines));
		
		///////////////////////////////////////////////////////////
		
		List<Long> vaccineIds=new ArrayList<>();
		vaccineIds.add(1l); // l for long ... vaccine available in database
		vaccineIds.add(2l); // l for long ... vaccine available in database
		vaccineIds.add(9l); // this vaccine not available in database currently
		
		service.getAllVaccineInfoByIds(vaccineIds).forEach((v)->System.out.println(v));		
		
		context.close();
	
	}
}
