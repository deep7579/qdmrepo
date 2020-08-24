package com.qdm.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qdm.productmanagement.entity.CSPackage;
import com.qdm.productmanagement.entity.CSService;

@Repository
public interface PackageRepository  extends JpaRepository<CSPackage,Integer>{
	@Query(value = "select name from cs_package ORDER BY id OFFSET ?1 * (?2 - 1) ROWS FETCH NEXT ?1 ROWS ONLY", nativeQuery = true)
	public List<CSPackage> getAllPackage(int pageSize, int pageNo, int pageSizes);

}
