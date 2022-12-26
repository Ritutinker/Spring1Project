package com.springbootorm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hospital {

	@Id
	@Column(name = "hosid")
	private int hId;
	@Column(name = "hosname", length = 20)
	private String hName;
	@Column(name = "hoslocation")
	private String hLocation;
	@Column(name = "hospincode")
	private int hPincode;
}
