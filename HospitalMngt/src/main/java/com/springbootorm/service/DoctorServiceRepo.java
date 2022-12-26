package com.springbootorm.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springbootorm.entity.Doctor;

@Component
public interface DoctorServiceRepo {

	Doctor postDoctor(Doctor d);

	Doctor getDoctor(int docId);

	List<Doctor> getAllDoctors();

	Doctor updateDoctor(Doctor params, int docId);

	String deleteDoctor(int docId);
}
