package com.tectoro.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Doctor;
import com.tectoro.Model.Hospital;
import com.tectoro.Model.patient;
import com.tectoro.Repository.DoctorRepository;
import com.tectoro.Repository.HospitalRepository;
import com.tectoro.Repository.PatientRepository;

import net.bytebuddy.asm.Advice.Return;

@Service
public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository hospitalRepository;
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Hospital saveDetails(Hospital hospital) {
		
		return hospitalRepository.save(hospital);
	}

	@Override
	public patient getById(int id) {
		
		 Optional<patient> findById = patientRepository.findById(id);
		 int id2 = findById.get().getId();
		 
		 
		 return patientRepository.getById(id2);
	}

	@Override
	public Doctor getByDocId(int id) {
		
		 Optional<Doctor> findById1 = doctorRepository.findById(id);
		 int id1 = findById1.get().getId();
		 return doctorRepository.getById(id);
	}

	@Override
	public Doctor updateById(Doctor doctor, int id) {
		 Doctor byId = doctorRepository.getById(id);
		
		 String id3 = byId.getDname();
		 byId.setDname(id3);
		 	
		return doctorRepository.save(doctor);
		
		
	}
}
