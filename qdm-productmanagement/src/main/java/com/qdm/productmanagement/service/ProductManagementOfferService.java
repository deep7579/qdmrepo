package com.qdm.productmanagement.service;

import java.util.List;

import com.qdm.productmanagement.entity.CSOffer;

public interface ProductManagementOfferService {
	
	List<CSOffer> getAllOffer(int pageSize, int pageNo);
	
	CSOffer findById(int id);
	
	void updateOffer(CSOffer service);
	
	CSOffer saveOffer(CSOffer csOffer);

}
