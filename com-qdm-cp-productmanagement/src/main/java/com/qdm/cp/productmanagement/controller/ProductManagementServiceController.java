package com.qdm.cp.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cp.productmanagement.entity.CSService;
import com.qdm.cp.productmanagement.service.ProductManagementService;

@RestController
@RequestMapping("/qdm/careProvider/productManagement")
public class ProductManagementServiceController {

	@Autowired
	public ProductManagementService productManagementService;

	@GetMapping("/services/getAllServices")
	public List<CSService> getAllServices(CSService csService) {
		return productManagementService.getAllServices(csService);
	}
	
	@PostMapping("/services")
	public CSService addService(@RequestBody CSService csService) {
		return productManagementService.saveService(csService);

	}

	

	
	@PutMapping("/services/{serviceId}")
	public ResponseEntity<CSService> modifyService(@RequestBody CSService csService, @PathVariable int serviceId) {
		CSService service = new CSService();
		service.setServiceId(345);
		return ResponseEntity.ok(service);
	}

}





