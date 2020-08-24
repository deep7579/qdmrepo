package com.qdm.productmanagement;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.qdm.productmanagement.entity.CSOffer;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.entity.CareProvider;
import com.qdm.productmanagement.repository.OfferRepository;
import com.qdm.productmanagement.repository.ServiceRepository;


@SpringBootApplication
@EnableJpaRepositories
public class ComQdmProductmanagementApplication  {

	
	public static void main(String[] args) {
		SpringApplication.run(ComQdmProductmanagementApplication.class, args);
	}
	/*
	 * private OfferRepository offerRepository;
	 * 
	 * @Bean public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	 * return new CommandLineRunner() {
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * CSOffer csOffer=new CSOffer(); csOffer.setName("EyeKit");
	 * csOffer.setStatus("activate"); offerRepository.save(csOffer); } }; }
	 */

	/*private OfferRepository offerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		CSOffer csOffer=new CSOffer();
		csOffer.setName("EyeKit");
		csOffer.setStatus("activate");
		this.offerRepository.save(csOffer);
		
		*/
		/*
		 * CSService csService=new CSService(); csService.setName("EyeKit");
		 * csService.setAmount(3456.59);
		 * csService.setUpdateDate(Calendar.getInstance().getTime().getDay());
		 * csService.setUpdateUser("Rankesh Panda");
		 * 
		 * CareProvider careProvider1=new CareProvider();
		 * 
		 * 
		 * 
		 * csService.getCareProvider().add(careProvider1);
		 * 
		 * this.ServiceRepository.save(csService);
		 */
		
		
	

}
