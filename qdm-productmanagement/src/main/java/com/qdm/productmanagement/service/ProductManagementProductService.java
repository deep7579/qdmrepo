package com.qdm.productmanagement.service;

import java.util.List;

import com.qdm.productmanagement.entity.CSProduct;

public interface ProductManagementProductService {
	
	List<CSProduct> getAllProduct(int pageSize, int pageNo);
	
	CSProduct findById(int id);
	
	void updateProduct(CSProduct service);
	
	CSProduct saveProduct(CSProduct csProduct);

}
