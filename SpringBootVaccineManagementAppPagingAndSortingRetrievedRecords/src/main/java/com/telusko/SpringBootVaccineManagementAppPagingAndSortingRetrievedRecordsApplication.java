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
public class SpringBootVaccineManagementAppPagingAndSortingRetrievedRecordsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVaccineManagementAppPagingAndSortingRetrievedRecordsApplication.class, args);
	
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	
//		Iterable<VaccineDetails> Vaccinelist = service.fetchDetails(true, "vaccineName", "vaccineCompany");
//	    Vaccinelist.forEach((c)->System.out.println(c.getVaccineName() + " => " + c.getVaccineCompany())); // Sending "true" boolean argument ... prints results in Ascending order
		
//		Iterable<VaccineDetails> Vaccinelist = service.fetchDetails(false, "vaccineName", "vaccineCompany"); // Sending "false" boolean argument ... prints results in Descending order
//	    Vaccinelist.forEach((c)->System.out.println(c.getVaccineName() + " => " + c.getVaccineCompany()));
	
//		service.fetchDetailsByPgNo(0, 2, true, "vaccineName",  "vaccineCompany").
//		forEach((c)->System.out.println(c.getVaccineName() + " => " + c.getVaccineCompany())); // get results from 1st page ... ie. Page zero .. 2 records per page
		
//		service.fetchDetailsByPgNo(1, 2, true, "vaccineName",  "vaccineCompany").
//		forEach((c)->System.out.println(c.getVaccineName() + " => " + c.getVaccineCompany())); // get results from 2nd page ... ie. Page 1 .. 2 records per page
		
		
//		service.fetchDetailsByPgNo(0, 3, true, "vaccineName",  "vaccineCompany").
//		forEach((c)->System.out.println(c.getVaccineName() + " => " + c.getVaccineCompany())); // get results from 1st page ... ie. Page zero .. 3 records per page
		
//		service.fetchDetailsByPagination(1); // get 1 record per page (ex.. 4 records spread over 4 different pages)
		
		service.fetchDetailsByPagination(2); // get 2 records per page (ex.. 4 records spread over two different pages)
		
		context.close();
	
	}

}
