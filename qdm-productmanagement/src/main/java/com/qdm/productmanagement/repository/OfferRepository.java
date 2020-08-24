package com.qdm.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.productmanagement.entity.CSOffer;

@Repository
public interface OfferRepository extends JpaRepository<CSOffer,Integer>{

}
