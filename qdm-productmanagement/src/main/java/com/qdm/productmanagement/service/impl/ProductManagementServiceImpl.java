package com.qdm.productmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.objectmapping.ProductManagementBO;
import com.qdm.productmanagement.repository.ServiceRepository;
import com.qdm.productmanagement.service.ProductManagementService;
import com.qdm.productmanagement.viewbean.ServicesList;

@Service
public class ProductManagementServiceImpl implements ProductManagementService {

	@Autowired
	public ServiceRepository serviceRepository;

	private static List<CSService> csServices;
	
	@Autowired
	private ProductManagementBO objProductManagementBO;

	@Override
	public ServicesList getAllServices(int pageSize, int pageNo) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<CSService> pagedResult = serviceRepository.findAll(paging);
		List<CSService> list = pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<CSService>();
		
		return objProductManagementBO.map(list, pageNo);
	}

	@Override
	public CSService saveService(CSService csService) {
		return serviceRepository.save(csService);
	}

	@Override
	public CSService findById(int id) {
		for (CSService service : csServices) {
			if (service.getServiceId() == id) {
				return service;
			}
		}

		return null;
	}

	@Override
	public void updateService(CSService service) {
		int index = csServices.indexOf(service);
		csServices.set(index, service);
	}

	public CSService activateService(CSService csService) {
		return serviceRepository.save(csService);
	}
}
