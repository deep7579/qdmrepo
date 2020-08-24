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
import com.qdm.productmanagement.entity.CSService;
import com.qdm.productmanagement.repository.PackageRepository;
import com.qdm.productmanagement.service.ProductManagementPackageService;

@Service("ProductManagementPackageService")
public class ProductManagementPackageServiceImpl implements ProductManagementPackageService{
	
	@Autowired
	public PackageRepository packageRepository;

	private static List<CSPackage> csPackage;

	public List<CSPackage> getAllPackage(int pageSize, int pageNo) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<CSPackage> pagedResult = packageRepository.findAll(paging);
		List<CSPackage> list = pagedResult.hasContent() ? pagedResult.getContent() : new ArrayList<CSPackage>();
		return list;

	}

	public CSPackage findById(int id) {
		for (CSPackage service : csPackage) {
			if (service.getPackageId() == id) {
				return service;
			}
		}

		return null;
	}

	public void updatePackage(CSPackage service) {
		int index = csPackage.indexOf(service);
		csPackage.set(index, service);
	}

	public CSPackage savePackage(CSPackage csPackage) {
		return packageRepository.save(csPackage);
	}

}
