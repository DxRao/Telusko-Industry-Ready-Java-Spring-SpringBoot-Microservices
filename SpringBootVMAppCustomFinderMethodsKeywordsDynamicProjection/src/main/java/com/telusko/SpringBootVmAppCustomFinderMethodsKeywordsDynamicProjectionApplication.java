package com.telusko;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.VaccineManagementImpl;
import com.telusko.view.ResultView1;
import com.telusko.view.ResultView2;
import com.telusko.view.ResultView3;

@SpringBootApplication
public class SpringBootVmAppCustomFinderMethodsKeywordsDynamicProjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootVmAppCustomFinderMethodsKeywordsDynamicProjectionApplication.class, args);
		
		VaccineManagementImpl service = context.getBean(VaccineManagementImpl.class);
	      
		
		List<ResultView2> list1 = service.fetchByVaccineCompany("Astrazenka", ResultView2.class);
		list1.forEach(v->System.out.println(v.getId() + " : " + v.getVaccineName() + " "+ v.getVaccineCompany()));
		
		
		List<ResultView1> list2 = service.fetchByVaccineCompany("Astrazenka", ResultView1.class);
		list2.forEach(v->System.out.println(v.getId() + " : "+ v.getVaccineCompany()));
		
		List<ResultView3> list3 = service.fetchByVaccineCompany("Astrazenka", ResultView3.class);
		list3.forEach(c->System.out.println(c.getPrice()));
		
		context.close();
	
	}

}
