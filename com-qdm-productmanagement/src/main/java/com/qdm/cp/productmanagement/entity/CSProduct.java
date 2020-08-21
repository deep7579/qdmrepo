package com.qdm.cp.productmanagement.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CS_Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSProduct {
	private int id;
	private String name;
	private String description;
	private float discountPercentage;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "csproduct_fid", referencedColumnName = "id")
	List<CSPackage> csPackage;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "csproduct_fid", referencedColumnName = "id")
	List<CSService> csService;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "csproduct_fid", referencedColumnName = "id")
	List<CareProvider> careProvider;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_fid", referencedColumnName = "id")
	List<CSCategory> careProviderCategory;

	/*
	 * private String updateUser; private Date updateDate;
	 */

}
