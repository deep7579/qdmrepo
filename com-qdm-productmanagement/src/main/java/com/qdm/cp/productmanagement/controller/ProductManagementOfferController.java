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

import com.qdm.cp.productmanagement.entity.CSOffer;
import com.qdm.cp.productmanagement.service.ProductManagementOfferService;
@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementOfferController {
	@Autowired
	private ProductManagementOfferService productOfferService;

	@GetMapping("/offers/getAllOffers")
	public ResponseEntity<List<CSOffer>> getAllOffer() {
		List<CSOffer> offers=productOfferService.getAllOffer();
		return new ResponseEntity<List<CSOffer>>(offers,HttpStatus.OK);
	}
	
	@PostMapping("/offers")
	public ResponseEntity<?> addOffer(@RequestBody CSOffer csOffer) {
		return new ResponseEntity<CSOffer>(productOfferService.saveOffer(csOffer),HttpStatus.CREATED);

	}

}
