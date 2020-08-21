package com.qdm.cp.productmanagement.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CS_Package")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSPackage {
 private int packageId;
 private String name;
 private float discountPercentage;
 private String updateUser;
private Date updateDate;
 
 

}
