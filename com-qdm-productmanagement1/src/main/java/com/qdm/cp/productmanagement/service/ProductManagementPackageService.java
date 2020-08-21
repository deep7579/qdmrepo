package com.qdm.cp.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cp.productmanagement.entity.CSPackage;

import com.qdm.cp.productmanagement.repository.PackageRepository;
@Service
public class ProductManagementPackageService {
	@Autowired
	public PackageRepository packageRepository;
	
	public List<CSPackage> getAllPackage() {
		return packageRepository.findAll();
		
	}
	 
	 public CSPackage savePackage(CSPackage csPackage) {
		 return packageRepository.save(csPackage);
	 }

}
