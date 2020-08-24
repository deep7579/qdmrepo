package com.qdm.productmanagement.entity;

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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="tbl_cs_Service")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CSService {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serviceId;
	
	private String name;
	
	private double amount;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="cservice_fid",referencedColumnName = "serviceId")
	List<CareProvider> careProvider;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "service_fid",referencedColumnName = "serviceId")
	List<CSCategory> careProviderCategory;
	
	private String updateUser; 
	private Date updateDate;
	

}
