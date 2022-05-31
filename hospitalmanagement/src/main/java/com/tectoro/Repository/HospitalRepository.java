package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Hospital;
@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
