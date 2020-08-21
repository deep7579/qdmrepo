package com.qdm.cp.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cp.productmanagement.entity.CSPackage;
import com.qdm.cp.productmanagement.entity.CSService;
import com.qdm.cp.productmanagement.service.ProductManagementPackageService;
@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementPackageController {
	@Autowired
	private ProductManagementPackageService managementPackageService;

	@GetMapping("/packages/getAllPackages")
	public ResponseEntity< List<CSPackage>> getAllPackage() {
		List<CSPackage> packages=managementPackageService.getAllPackage();
		return new ResponseEntity<List<CSPackage>>(packages,HttpStatus.OK);
	}
	
	@PostMapping("/packages")
	public ResponseEntity<?> addPackage(@RequestBody CSPackage csPackage) {
		return new ResponseEntity<CSPackage>( managementPackageService.savePackage(csPackage),HttpStatus.CREATED);

	}

	


}