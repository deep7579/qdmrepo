package com.qdm.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qdm.productmanagement.entity.CSPackage;
import com.qdm.productmanagement.entity.CSProduct;

@Repository
public interface ProductRepository  extends JpaRepository<CSProduct, Integer>{
	
	@Query(value = "select name from tbl_CS_Product ORDER BY id OFFSET ?1 * (?2 - 1) ROWS FETCH NEXT ?1 ROWS ONLY", nativeQuery = true)
	public List<CSProduct> getAllProduct(int pageSize, int pageNo, int pageSizes);

}
