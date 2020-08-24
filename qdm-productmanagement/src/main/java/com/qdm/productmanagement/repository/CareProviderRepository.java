package com.qdm.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qdm.productmanagement.entity.CSProduct;
import com.qdm.productmanagement.entity.CareProvider;

public interface CareProviderRepository extends JpaRepository<CareProvider, Integer> {
	

}
