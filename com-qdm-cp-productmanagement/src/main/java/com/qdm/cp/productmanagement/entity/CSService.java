package com.qdm.cp.productmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CS_Service")
public class CSService {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serviceId;
	private String serviceName;
	private CareProvider careProvider;
	private CSCategory csCategory;
	private String Status;

}
