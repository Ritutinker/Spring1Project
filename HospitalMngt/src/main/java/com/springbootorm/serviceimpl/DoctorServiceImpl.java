package com.springbootorm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootorm.entity.Doctor;
import com.springbootorm.repository.DoctorRepository;
import com.springbootorm.service.DoctorServiceRepo;

@Service
public class DoctorServiceImpl implements DoctorServiceRepo {

	@Autowired
	private DoctorRepository DoctorRepository;

	@Override
	public Doctor postDoctor(Doctor d) {

		return DoctorRepository.save(d);
	}

	@Override
	public Doctor getDoctor(int docId) {
		// TODO Auto-generated method stub
		return DoctorRepository.findById(docId).get();
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return DoctorRepository.findAll();
	}

	@Override
	public Doctor updateDoctor(Doctor params, int docId) {
		// TODO Auto-generated method stub
		Doctor _doctor = DoctorRepository.findById(docId).get();
		_doctor.setDocName(params.getDocName());
		_doctor.setDocAge(params.getDocAge());
		_doctor.setDocEmail(params.getDocEmail());
		_doctor.setDocMobile(params.getDocMobile());
		return DoctorRepository.save(_doctor);
	}

	@Override
	public String deleteDoctor(int docId) {
		// TODO Auto-generated method stub
		DoctorRepository.deleteById(docId);
		return "the Doctor with id " + docId + " has been deleted...";
	}

}
