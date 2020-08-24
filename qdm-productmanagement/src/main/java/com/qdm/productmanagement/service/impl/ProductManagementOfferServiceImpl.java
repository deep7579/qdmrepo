package com.qdm.productmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qdm.productmanagement.entity.CSOffer;
import com.qdm.productmanagement.entity.CSPackage;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.repository.OfferRepository;
import com.qdm.productmanagement.repository.PackageRepository;
import com.qdm.productmanagement.service.ProductManagementOfferService;

@Service("ProductManagementOfferService")
public class ProductManagementOfferServiceImpl implements ProductManagementOfferService{
	@Autowired
	public OfferRepository offerRepository;
	
	private static List<CSOffer> csOffer;
	
	@Override
	public List<CSOffer> getAllOffer(int pageSize, int pageNo) {
		
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<CSOffer> pagedResult = offerRepository.findAll(paging);
		List<CSOffer> list = pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<CSOffer>();
		return list;
		
	}
	
	@Override
	public CSOffer findById(int id) {
		 for(CSOffer service : csOffer){
	         if(service.getId() == id){
	             return service;
	         }
	     }
	     
		 return null ;
	 }
	 
	 @Override
	 public void updateOffer(CSOffer service) {
	     int index = csOffer.indexOf(service);
	     csOffer.set(index, service);
	 }
	 
	 @Override
	 public CSOffer saveOffer(CSOffer csOffer) {
		 return offerRepository.save(csOffer);
	 }


}
