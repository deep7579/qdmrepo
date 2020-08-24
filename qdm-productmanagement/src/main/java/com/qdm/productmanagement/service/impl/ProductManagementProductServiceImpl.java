package com.qdm.productmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qdm.productmanagement.entity.CSOffer;
import com.qdm.productmanagement.entity.CSPackage;
import com.qdm.productmanagement.entity.CSProduct;
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.repository.PackageRepository;
import com.qdm.productmanagement.repository.ProductRepository;
import com.qdm.productmanagement.service.ProductManagementProductService;

@Service
public class ProductManagementProductServiceImpl implements ProductManagementProductService{

	@Autowired
	public ProductRepository productRepository;

	private static List<CSProduct> csProduct;
	

	public List<CSProduct> getAllProduct(int pageSize, int pageNo) {
		//return productRepository.findAll();
		
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<CSProduct> pagedResult = productRepository.findAll(paging);
		List<CSProduct> list = pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<CSProduct>();
		return list;

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
