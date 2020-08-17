package com.qdm.cp.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cp.productmanagement.entity.CSService;

@Repository

public interface ServiceRepository extends JpaRepository<CSService, Integer> {

}
