package com.qdm.cp.productmanagement;

import java.util.Calendar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.qdm.cp.productmanagement.entity.CSService;
import com.qdm.cp.productmanagement.entity.CareProvider;
import com.qdm.cp.productmanagement.repository.ServiceRepository;

@SpringBootApplication
@EnableJpaRepositories
public class ComQdmCpProductmanagementApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(ComQdmCpProductmanagementApplication.class, args);
	}

	private ServiceRepository ServiceRepository;
	@Override
	public void run(String... args) throws Exception {
		
		CSService csService=new CSService();
		csService.setName("EyeKit");
		csService.setAmount(3456.59);
		csService.setUpdateDate(Calendar.getInstance().getTime().getDay());
		csService.setUpdateUser("Rankesh Panda");
		
		CareProvider careProvider=new CareProvider();
		
		csService.getCareProvider().add(careProvider);
		
		this.ServiceRepository.save(csService);
		
		
	}

}
