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

import com.qdm.productmanagement.entity.CSProduct;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.service.ProductManagementProductService;

@RestController
@RequestMapping("qdm/cp/productManagement")
public class ProductManagementProductController {
	@Autowired
	private ProductManagementProductService productMangementService;

	@GetMapping("/product/getAll/{pageNo}/{pageSize}")
	public ResponseEntity<List<CSProduct>> getAllProduct(@PathVariable("pageSize") int pageSize,
			@PathVariable("pageNo") int pageNo) {
		List<CSProduct> product = productMangementService.getAllProduct(pageSize, pageNo);
		return new ResponseEntity<List<CSProduct>>(product, HttpStatus.OK);
	}

	@PostMapping("/products/add")
	public ResponseEntity<?> addProduct(@RequestBody CSProduct csProduct) {
		return new ResponseEntity<CSProduct>(productMangementService.saveProduct(csProduct), HttpStatus.CREATED);

	}

	
	  @PutMapping("/products/modify/{productId}") public ResponseEntity<CSProduct>
	  modifyService(@RequestBody CSProduct csProduct,
	  
	  @PathVariable("id") int productId) { CSProduct productData =
	  productMangementService.findById(productId);
	  
	  if (productData == null) { return new
	  ResponseEntity<CSProduct>(HttpStatus.NOT_FOUND); }
	  
	  productData.setName(csProduct.getName());
	  productData.setDescription(csProduct.getDescription());
	  productData.setDiscountPercentage(csProduct.getDiscountPercentage());
	  productData.setCareProvider(csProduct.getCareProvider());
	  productData.setCareProviderCategory(csProduct.getCareProviderCategory());
	  productData.setCsPackage(csProduct.getCsPackage());
	  productData.setCsService(csProduct.getCsService());
	  
	  productMangementService.saveProduct(productData); return new
	  ResponseEntity<CSProduct>(productData, HttpStatus.OK);
	  
	  }
	 

}
