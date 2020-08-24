package com.qdm.productmanagement.controller;

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

import com.qdm.productmanagement.entity.CSPackage;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.service.ProductManagementPackageService;

@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementPackageController {
	@Autowired
	private ProductManagementPackageService managementPackageService;

	@GetMapping("/packages/getAllPackages")
	public ResponseEntity<List<CSPackage>> getAllPackage() {
		List<CSPackage> packages = managementPackageService.getAllPackage();
		return new ResponseEntity<List<CSPackage>>(packages, HttpStatus.OK);
	}

	@PostMapping("/packages/add")
	public ResponseEntity<?> addPackage(@RequestBody CSPackage csPackage) {
		return new ResponseEntity<CSPackage>(managementPackageService.savePackage(csPackage), HttpStatus.CREATED);

	}

	
	  @PutMapping("/package/modify/{packageId}") public ResponseEntity<CSPackage>
	  modifyService(@RequestBody CSPackage csPackage,
	  
	  @PathVariable("id") int packageId) { CSPackage packageData =
	  managementPackageService.findById(packageId);
	  
	  if (packageData == null) { return new
	  ResponseEntity<CSPackage>(HttpStatus.NOT_FOUND); }
	  
	  packageData.setName(csPackage.getName());
	  packageData.setDiscountPercentage(csPackage.getDiscountPercentage());
	  packageData.setCareProvider(csPackage.getCareProvider());
	  packageData.setCareProviderCategory(csPackage.getCareProviderCategory());
	  packageData.setCsDurationType(csPackage.getCsDurationType());
	  packageData.setCsService(csPackage.getCsService());
	  
	  managementPackageService.updatePackage(packageData); return new
	  ResponseEntity<CSPackage>(packageData, HttpStatus.OK);
	  
	  }
	 
}
