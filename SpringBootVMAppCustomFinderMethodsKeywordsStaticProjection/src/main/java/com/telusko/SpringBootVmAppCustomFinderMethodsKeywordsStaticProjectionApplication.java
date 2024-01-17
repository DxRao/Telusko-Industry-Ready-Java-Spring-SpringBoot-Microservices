package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.VaccineDetails;
import com.telusko.service.VaccineManagementImpl;
import com.telusko.view.ResultView;

@SpringBootApplication
public class SpringBootVmAppCustomFinderMethodsKeywordsStaticProjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVmAppCustomFinderMethodsKeywordsStaticProjectionApplication.class, args);
	
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
		  
		List<ResultView> list = service.fetchByPriceLessThan(45365);
		list.forEach((vac)->System.out.println(vac.getVaccineName()+ " : "+ vac.getVaccineCompany())); // Records fetched only for 2-Columns of customized methods' 
		
		
		context.close();
	}
}
	


