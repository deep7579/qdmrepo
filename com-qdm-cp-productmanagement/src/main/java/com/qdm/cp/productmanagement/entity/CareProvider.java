package com.qdm.cp.productmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="Care_Provider")
@Data
public class CareProvider {
private int careProviderId;
private String name;
private String type;
private String status;


}
