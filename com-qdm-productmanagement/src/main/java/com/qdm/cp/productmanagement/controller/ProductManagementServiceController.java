package com.qdm.cp.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	public ResponseEntity<List<CSService>> getAllServices() {
		List<CSService> service = productManagementService.getAllServices();
		return new ResponseEntity<List<CSService>>(service, HttpStatus.OK);
	}

	@PostMapping("/services")
	public ResponseEntity<CSService> addService(@RequestBody CSService csService) {
		return new ResponseEntity<CSService>(productManagementService.saveService(csService), HttpStatus.CREATED);

	}

	@PutMapping("/services/{serviceId}")
	public ResponseEntity<CSService> modifyService(@RequestBody CSService csService,
			@PathVariable("id") int serviceId) {
		CSService service = productManagementService.findById(serviceId);
		if (service == null) {
			return new ResponseEntity<CSService>(HttpStatus.NOT_FOUND);
		}

		service.setName(csService.getName());
		service.setAmount(csService.getAmount());
		service.setCareProvider(csService.getCareProvider());
		service.setCareProviderCategory(csService.getCareProviderCategory());
		service.setUpdateDate(csService.getUpdateDate());
		service.setUpdateUser(csService.getUpdateUser());
		productManagementService.updateService(service);

		return new ResponseEntity<CSService>(service, HttpStatus.OK);
	}

}
