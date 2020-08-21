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

private static List<CSService> csServices;
 
 
public List<CSService> getAllServices() {
	return serviceRepository.findAll();
	
}
 
 public CSService saveService(CSService csService) {
	 return serviceRepository.save(csService);
 }
 
 public CSService findById(int id) {
	 for(CSService service : csServices){
         if(service.getServiceId() == id){
             return service;
         }
     }
     
	 return null;
 }
 
 public void updateService(CSService service) {
     int index = csServices.indexOf(service);
     csServices.set(index, service);
 }
 public CSService activateService(CSService csService) {
	 return serviceRepository.save(csService);
 }
}
