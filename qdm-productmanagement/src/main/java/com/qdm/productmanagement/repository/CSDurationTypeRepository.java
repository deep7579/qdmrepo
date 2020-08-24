package com.qdm.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.productmanagement.entity.CSDurationType;

@Repository
public interface CSDurationTypeRepository extends JpaRepository<CSDurationType,Integer>{

}
