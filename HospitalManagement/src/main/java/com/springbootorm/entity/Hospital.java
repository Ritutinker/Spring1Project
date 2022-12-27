package com.springbootorm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hospid")
	private int hId;
	@Column(name = "hospname", length = 20)
	private String hName;
	@Column(name = "hosplocation")
	private String hLocation;
	@Column(name = "hosppincode")
	private int hPincode;
}
