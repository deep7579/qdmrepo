package com.qdm.cp.productmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CS_Offer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSOffer {
	private int id;
	private String name;
	private String Status;
	

}