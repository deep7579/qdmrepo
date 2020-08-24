package com.qdm.productmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qdm.productmanagement.entity.CSOffer;
import com.qdm.productmanagement.entity.CSProduct;

@Repository
public interface OfferRepository extends JpaRepository<CSOffer,Integer>{
	
	@Query(value = "select name from tbl_CS_Offer ORDER BY id OFFSET ?1 * (?2 - 1) ROWS FETCH NEXT ?1 ROWS ONLY", nativeQuery = true)
	public List<CSOffer> getAllOffer(int pageSize, int pageNo, int pageSizes);

}
