package com.qdm.cp.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cp.productmanagement.entity.CSPackage;
import com.qdm.cp.productmanagement.entity.CSProduct;
import com.qdm.cp.productmanagement.service.ProductManagementPackageService;
import com.qdm.cp.productmanagement.service.ProductManagementProductService;
@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementProductController {
	@Autowired
	private ProductManagementProductService productMangementService;

	@GetMapping("/product/getAllProducts")
	public List<CSProduct> getAllProduct() {
		return productMangementService.getAllProduct();
	}
	
	@PostMapping("/products")
	public CSProduct addProduct(@RequestBody CSProduct csProduct) {
		return productMangementService.saveProduct(csProduct);

	}

}
