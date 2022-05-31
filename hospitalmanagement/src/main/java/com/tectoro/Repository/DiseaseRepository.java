package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Disease;
@Repository
public interface DiseaseRepository extends JpaRepository<Disease, Integer>{

}
