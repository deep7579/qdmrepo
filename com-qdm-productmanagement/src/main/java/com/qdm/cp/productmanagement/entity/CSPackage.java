package com.qdm.cp.productmanagement.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CS_Package")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSPackage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int packageId;
	private String name;
	private float discountPercentage;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cspackages_fid", referencedColumnName = "packageId")
	List<CSService> csService;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cspackage_fid", referencedColumnName = "packageId")
	List<CareProvider> careProvider;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "package_fid", referencedColumnName = "packageId")
	List<CSCategory> careProviderCategory;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "packages_fid", referencedColumnName = "packageId")
	List<CSDurationType> csDurationType;
	/*
	 * private String updateUser; private Date updateDate;
	 */

}
