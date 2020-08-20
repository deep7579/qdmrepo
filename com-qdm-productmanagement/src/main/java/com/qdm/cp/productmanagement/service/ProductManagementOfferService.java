package com.qdm.cp.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cp.productmanagement.entity.CSOffer;
import com.qdm.cp.productmanagement.entity.CSPackage;
import com.qdm.cp.productmanagement.repository.OfferRepository;
import com.qdm.cp.productmanagement.repository.PackageRepository;

@Service
public class ProductManagementOfferService {
	@Autowired
	public OfferRepository offerRepository;
	
	public List<CSOffer> getAllOffer() {
		return  offerRepository.findAll();
		
	}
	 
	 public CSOffer saveOffer(CSOffer csOffer) {
		 return offerRepository.save(csOffer);
	 }


}
