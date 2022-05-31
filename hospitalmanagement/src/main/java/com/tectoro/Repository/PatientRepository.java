package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.patient;
@Repository
public interface PatientRepository extends JpaRepository<patient, Integer>{

}
