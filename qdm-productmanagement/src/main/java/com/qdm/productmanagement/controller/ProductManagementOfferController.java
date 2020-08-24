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

import com.qdm.productmanagement.entity.CSOffer;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.service.ProductManagementOfferService;

@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementOfferController {
	@Autowired
	private ProductManagementOfferService productOfferService;

	@GetMapping("/offers/getAllOffers")
	public ResponseEntity<List<CSOffer>> getAllOffer() {
		List<CSOffer> offers = productOfferService.getAllOffer();
		return new ResponseEntity<List<CSOffer>>(offers, HttpStatus.OK);
	}

	@PostMapping("/offers/add")
	public ResponseEntity<?> addOffer(@RequestBody CSOffer csOffer) {
		return new ResponseEntity<CSOffer>(productOfferService.saveOffer(csOffer), HttpStatus.CREATED);

	}

	@PutMapping("/offer/modify/{offerId}")
	public ResponseEntity<CSOffer> modifyService(@RequestBody CSOffer csOffer, @PathVariable("OfferId") int offerId) {
		CSOffer offerData = productOfferService.findById(offerId);
		if (offerData == null) {
			return new ResponseEntity<CSOffer>(HttpStatus.NOT_FOUND);
		}

		offerData.setName(csOffer.getName());
		offerData.setStatus(csOffer.getStatus());
		productOfferService.saveOffer(offerData);
		return new ResponseEntity<CSOffer>(offerData, HttpStatus.OK);

	}

}
