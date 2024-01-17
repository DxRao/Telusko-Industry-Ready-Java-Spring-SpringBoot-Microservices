package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootVaccineManagementAppCustomFinderMethodsKeywordsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVaccineManagementAppCustomFinderMethodsKeywordsApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	     
//		service.searchByVaccinePrice(4645).forEach(v->System.out.println(v));
//		service.searchByCompanyName("Pfizer").forEach(v->System.out.println(v));
		
//		service.searchByPriceLessThan(45454).forEach(v->System.out.println(v));
		
		List<String> vaccines=new ArrayList<>();
		vaccines.add("Moderna");
		vaccines.add("CoviShield");
		vaccines.add("Covaxin");
		
		service.searchByVaccineNameInAndPriceBetween(vaccines, 345,565745).
		forEach(v->System.out.println(v));
		
		context.close();
		}
}