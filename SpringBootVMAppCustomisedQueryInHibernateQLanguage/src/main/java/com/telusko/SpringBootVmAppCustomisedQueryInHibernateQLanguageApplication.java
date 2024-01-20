package com.telusko;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringBootVmAppCustomisedQueryInHibernateQLanguageApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVmAppCustomisedQueryInHibernateQLanguageApplication.class, args);
	
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	     
		service.fetchVaccineByCompanyName("Astrazenka").forEach(v->System.out.println(v));
		System.out.println("*********************************************");
	
		service.fetchVaccineByCompanies("Pfizer", "BharatBiotech").forEach(c->System.out.println(c));
	
		System.out.println("************************************************");
	
		service.fetchVaccineByPriceRange(454, 54345).forEach(c->System.out.println(c));
	
		System.out.println("************************************************");
		
		List<Object[]> vaccineDetails = service.fetchVaccineDetailByVaccineName("Moderna", "Covaxin");
		
		for(Object[] obj:vaccineDetails)
		{
			for(Object vaccine: obj)
			{
				System.out.print(vaccine + " -> ");
			}
			System.out.println();
			
		}
//		System.out.println(service.changePriceByVaccine(4445, "CoviSheild"));
//		System.out.println("No of record deleted : "+ service.deleteVaccinesByPrice(4544, 34524));
		
//		System.out.println(service.insertVaccines("DNAvaccine", "Roche", 4645));
		
		Date date = service.getSystemDateAndTime();
		
		System.out.println("Current date and Time of System "+ date);
		
		context.close();
	}

}
