package com.qdm.cp.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cp.productmanagement.entity.CSOffer;
import com.qdm.cp.productmanagement.entity.CSPackage;
import com.qdm.cp.productmanagement.service.ProductManagementOfferService;
import com.qdm.cp.productmanagement.service.ProductManagementPackageService;
@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementOfferController {
	@Autowired
	private ProductManagementOfferService productOfferService;

	@GetMapping("/offers/getAllOffers")
	public List<CSOffer> getAllOffer() {
		return productOfferService.getAllOffer();
	}
	
	@PostMapping("/packages")
	public CSOffer addOffer(@RequestBody CSOffer csOffer) {
		return productOfferService.saveOffer(csOffer);

	}

}
