package com.tectoro.Service;

import java.util.List;

import com.tectoro.Model.Doctor;
import com.tectoro.Model.Hospital;
import com.tectoro.Model.patient;

public interface HospitalService {

	Hospital saveDetails(Hospital hospital);

	patient getById(int id);

	Doctor getByDocId(int id);

	Doctor updateById(Doctor doctor, int id);

}
