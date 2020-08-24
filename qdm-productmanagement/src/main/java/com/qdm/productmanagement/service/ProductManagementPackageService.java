package com.qdm.productmanagement.service;

import java.util.List;

import com.qdm.productmanagement.entity.CSPackage;

public interface ProductManagementPackageService {
	
	List<CSPackage> getAllPackage(int pageSize, int pageNo);
	
	CSPackage findById(int id);
	
	void updatePackage(CSPackage service);
	
	CSPackage savePackage(CSPackage csPackage);

}
