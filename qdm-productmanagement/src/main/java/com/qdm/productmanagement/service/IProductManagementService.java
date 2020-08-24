package com.qdm.productmanagement.service;

import java.util.List;

import com.qdm.productmanagement.entity.CSService;

public interface IProductManagementService {

	List<CSService> getAllServices(int pageSize,int pageNo);
	

	CSService saveService(CSService csService);

	CSService findById(int id);

	void updateService(CSService service);

}
