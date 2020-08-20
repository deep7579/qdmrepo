package com.qdm.cp.productmanagement.entity;

import java.sql.Blob;

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
private Blob logo;
private String status;
private String inChargeName;
private long mobile;
private String address;
private String email;
private CSProduct csProduct;
private CSOffer csOffer;




}
