package com.qdm.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.productmanagement.entity.CSPackage;
import com.qdm.productmanagement.entity.CSProduct;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.repository.PackageRepository;
import com.qdm.productmanagement.repository.ProductRepository;

@Service
public class ProductManagementProductService {

	@Autowired
	public ProductRepository productRepository;

	private static List<CSProduct> csProduct;

	public List<CSProduct> getAllProduct() {
		return productRepository.findAll();

	}

	public CSProduct findById(int id) {
		for (CSProduct service : csProduct) {
			if (service.getId() == id) {
				return service;
			}
		}

		return null;
	}

	public void updateProduct(CSProduct service) {
		int index = csProduct.indexOf(service);
		csProduct.set(index, service);
	}

	public CSProduct saveProduct(CSProduct csProduct) {
		return productRepository.save(csProduct);
	}

}
