package com.springbootorm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctor {

	@Id
	private int docId;
	@Column(name = "doctorname", length = 20)
	private String docName;
	@Column(name = "doctorage")
	private int docAge;
	@Column(name = "doctoremail", length = 30, unique = true)
	@NotNull(message = "must include email in postman API")
	@NotBlank(message = "must type value in email")
	@Email(message = "please provide proper email id")
	private String docEmail;
	@Column(name = "doctormobile", length = 10)
	private String docMobile;

	@OneToOne(cascade = CascadeType.ALL)
	private Hospital hospital;
}
