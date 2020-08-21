package com.qdm.cp.productmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cp.productmanagement.entity.CSService;
import com.qdm.cp.productmanagement.repository.ServiceRepository;

@Service
public class ProductManagementService {

@Autowired
 public ServiceRepository serviceRepository;
 
 
public List<CSService> getAllServices() {
	return serviceRepository.findAll();
	
}
 
 public CSService saveService(CSService csService) {
	 return serviceRepository.save(csService);
 }
 
 public Optional<CSService> getServicesById(int id) {
	 return serviceRepository.findById(id);
 }
 public CSService activateService(CSService csService) {
	 return serviceRepository.save(csService);
 }
}
