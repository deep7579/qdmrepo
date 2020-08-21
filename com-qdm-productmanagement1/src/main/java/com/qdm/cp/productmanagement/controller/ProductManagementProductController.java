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


import com.qdm.cp.productmanagement.entity.CSProduct;
import com.qdm.cp.productmanagement.service.ProductManagementProductService;
@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementProductController {
	@Autowired
	private ProductManagementProductService productMangementService;

	@GetMapping("/product/getAllProducts")
	public ResponseEntity<List<CSProduct>>getAllProduct() {
		List<CSProduct> product=productMangementService.getAllProduct();
		return  new ResponseEntity<List<CSProduct>>(product,HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<?> addProduct(@RequestBody CSProduct csProduct) {
		return new ResponseEntity<CSProduct>( productMangementService.saveProduct(csProduct),HttpStatus.CREATED);

	}

}
