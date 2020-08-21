package com.qdm.cp.productmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CS_Duration_Type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CSDurationType {
	private int id;
	private String  description;
	private boolean isDeleted;

}