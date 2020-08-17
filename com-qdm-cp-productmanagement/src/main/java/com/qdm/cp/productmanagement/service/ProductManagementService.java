package com.qdm.cp.productmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qdm.cp.productmanagement.entity.CSService;
import com.qdm.cp.productmanagement.repository.ServiceRepository;

@Service
public class ProductManagementService {
 public ServiceRepository serviceRepository;
 
 
public List<CSService> getAllServices(CSService csService) {
	return serviceRepository.findAll();
	
}
 
 public CSService saveService(CSService csService) {
	 return serviceRepository.save(csService);
 }
 
 public CSService activateService(CSService csService) {
	 return serviceRepository.save(csService);
 }
}
