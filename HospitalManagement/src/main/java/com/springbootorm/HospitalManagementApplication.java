package com.springbootorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootorm.entity.Doctor;
import com.springbootorm.entity.Hospital;
import com.springbootorm.repository.DoctorRepository;

@SpringBootApplication
public class HospitalManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Doctor doc1 = new Doctor();
		doc1.setDocId(101);
		doc1.setDocName("Ritu_Tinker");
		doc1.setDocAge(21);
		doc1.setDocEmail("ritutinker284@gmail.com");
		doc1.setDocMobile("9817229673");

		Doctor doc2 = new Doctor();
		doc2.setDocId(102);
		doc2.setDocName("Rudhra_Anant");
		doc2.setDocAge(24);
		doc2.setDocEmail("rudhranant@gmail.com");
		doc2.setDocMobile("9123564578");

		Doctor doc3 = new Doctor();
		doc3.setDocId(103);
		doc3.setDocName("Anjali");
		doc3.setDocAge(25);
		doc3.setDocEmail("anjali@gmail.com");
		doc3.setDocMobile("8824356098");

		Doctor doc4 = new Doctor();
		doc4.setDocId(104);
		doc4.setDocName("Ritika");
		doc4.setDocAge(25);
		doc4.setDocEmail("ritika@gmail.com");
		doc4.setDocMobile("8824356098");

		Hospital hosp1 = new Hospital();
		hosp1.setHId(11);
		hosp1.setHName("R.B.yadav hospital");
		hosp1.setHLocation("Delhi");
		hosp1.setHPincode(133001);

		Hospital hosp2 = new Hospital();
		hosp2.setHId(12);
		hosp2.setHName("Goverment Hospital");
		hosp2.setHLocation("Gurugram");
		hosp2.setHPincode(122001);

		Hospital hosp3 = new Hospital();
		hosp3.setHId(13);
		hosp3.setHName("Cygnus Hospital");
		hosp3.setHLocation("Rewari");
		hosp3.setHPincode(411003);

		Hospital hosp4 = new Hospital();
		hosp4.setHId(14);
		hosp4.setHName("Tyfoid Hospital");
		hosp4.setHLocation("Rewari");
		hosp4.setHPincode(411003);

		doc1.setHospital(hosp2);
		doc2.setHospital(hosp3);
		doc3.setHospital(hosp4);
		doc4.setHospital(hosp1);

		doctorRepository.save(doc1);
		doctorRepository.save(doc2);
		doctorRepository.save(doc3);
		doctorRepository.save(doc4);
		System.out.println("______________________4 entry Saved Successfull____________________");
		System.out.println("___________________________Data Saved_________________________");
	}

}
