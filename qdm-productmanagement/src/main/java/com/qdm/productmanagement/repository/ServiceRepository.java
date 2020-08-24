package com.qdm.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.qdm.productmanagement.entity.CSService;

@Repository

public interface ServiceRepository extends JpaRepository<CSService, Integer> {

	@Query(value = "select name from cs_service ORDER BY id OFFSET ?1 * (?2 - 1) ROWS FETCH NEXT ?1 ROWS ONLY", nativeQuery = true)
	public List<CSService> getAllServices(int pageSize, int pageNo, int pageSizes);

}
