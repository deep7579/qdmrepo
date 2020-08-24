package com.qdm.productmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.repository.ServiceRepository;

@Service
public class ProductManagementService implements IProductManagementService {

	@Autowired
	public ServiceRepository serviceRepository;

	private static List<CSService> csServices;

	@Override
	public List<CSService> getAllServices(int pageSize, int pageNo) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<CSService> pagedResult = serviceRepository.findAll(paging);
		return pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<CSService>();
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
