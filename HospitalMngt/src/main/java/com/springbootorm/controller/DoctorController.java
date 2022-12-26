package com.springbootorm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootorm.entity.Doctor;
import com.springbootorm.service.DoctorServiceRepo;

@RestController
public class DoctorController {
	@Autowired
	private DoctorServiceRepo doctorServiceRepo;

	@PostMapping(value = "/doctors")
	public Doctor addController(@RequestBody Doctor doctor) {
		return doctorServiceRepo.postDoctor(doctor);
	}

	@GetMapping(value = "/doctors/{docId}")
	public Doctor getController(@PathVariable int docId) {
		return doctorServiceRepo.getDoctor(docId);
	}

	@GetMapping(value = "/doctors")
	public List<Doctor> getAllController() {
		return doctorServiceRepo.getAllDoctors();
	}

	@PutMapping(value = "/doctors/{docId}")
	public Doctor updateController(@PathVariable int docId, @RequestBody Doctor doctor) {
		return doctorServiceRepo.updateDoctor(doctor, docId);
	}

	@DeleteMapping(value = "/doctors/{id}")
	public String deleteController(@PathVariable int id) {
		return doctorServiceRepo.deleteDoctor(id);
	}

	@PostMapping("/doctorValid")
	public ResponseEntity<Doctor> addValidDoctor(@Valid @RequestBody Doctor p) {
		Doctor savedDoctor = doctorServiceRepo.postDoctor(p);
		return new ResponseEntity<Doctor>(savedDoctor, HttpStatus.CREATED);

	}
}
