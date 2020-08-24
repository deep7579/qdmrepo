package com.qdm.productmanagement.component;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.qdm.productmanagement.entity.CSOffer;
import com.qdm.productmanagement.repository.OfferRepository;

public class AppStartupRunner implements ApplicationRunner {
	private OfferRepository offerRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		/*
		 * CSOffer csOffer=new CSOffer(); csOffer.setName("EyeKit");
		 * csOffer.setStatus("activate"); this.offerRepository.save(csOffer);
		 */
	}

}
