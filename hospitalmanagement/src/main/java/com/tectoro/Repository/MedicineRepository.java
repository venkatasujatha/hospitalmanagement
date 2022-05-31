package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Medicine;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

}
