package com.qdm.cp.productmanagement.entity;

import java.sql.Blob;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Care_Provider")
@Data
public class CareProvider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int careProviderId;
	private String name;
	private String type;
	private Blob logo;
	private String status;
	private String inChargeName;
	private long mobile;
	private String address;
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "careprovider_fid", referencedColumnName = "careProviderId")
	List<CSProduct> csProduct;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "careprovide_fid", referencedColumnName = "careProviderId")
	List<CSOffer> csOffer;

}
