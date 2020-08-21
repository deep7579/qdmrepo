package com.qdm.cp.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cp.productmanagement.entity.CSPackage;
import com.qdm.cp.productmanagement.entity.CSService;
import com.qdm.cp.productmanagement.repository.PackageRepository;

@Service
public class ProductManagementPackageService {
	@Autowired
	public PackageRepository packageRepository;

	private static List<CSPackage> csPackage;

	public List<CSPackage> getAllPackage() {
		return packageRepository.findAll();

	}

	public CSPackage findById(int id) {
		for (CSPackage service : csPackage) {
			if (service.getPackageId() == id) {
				return service;
			}
		}

		return null;
	}

	public void updateService(CSPackage service) {
		int index = csPackage.indexOf(service);
		csPackage.set(index, service);
	}

	public CSPackage savePackage(CSPackage csPackage) {
		return packageRepository.save(csPackage);
	}

}
