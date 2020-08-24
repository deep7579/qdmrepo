package com.qdm.productmanagement.service;

import java.util.List;

import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.viewbean.ServicesList;

public interface ProductManagementService {

	ServicesList getAllServices(int pageSize,int pageNo);
	

	CSService saveService(CSService csService);

	CSService findById(int id);

	void updateService(CSService service);

}
