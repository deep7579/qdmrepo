package com.qdm.cp.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cp.productmanagement.entity.CSPackage;
import com.qdm.cp.productmanagement.entity.CSProduct;
import com.qdm.cp.productmanagement.repository.PackageRepository;
import com.qdm.cp.productmanagement.repository.ProductRepository;
@Service
public class ProductManagementProductService {
	
	@Autowired
	public ProductRepository productRepository;
	
	public List<CSProduct> getAllProduct() {
		return productRepository.findAll();
		
	}
	 
	 public CSProduct saveProduct(CSProduct csProduct) {
		 return productRepository.save(csProduct);
	 }


}
