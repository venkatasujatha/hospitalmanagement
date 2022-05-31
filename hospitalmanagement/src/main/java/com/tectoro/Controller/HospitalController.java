package com.tectoro.Controller;

import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.Model.Doctor;
import com.tectoro.Model.Hospital;
import com.tectoro.Model.patient;
import com.tectoro.Service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/save")
	public Hospital saveDetails(@RequestBody Hospital hospital)
	{
		return hospitalService.saveDetails(hospital);
	}
	
	//get the details of patient with patient id
	@GetMapping("/get/{id}")
	public patient getById(@PathVariable int id)
	{
		return hospitalService.getById(id);
	}
	//get the details with doctor id
	@GetMapping("/get1/{id}")
	public Doctor getByDocId(@PathVariable int id)
	{
		return hospitalService.getByDocId(id);
	}
	
	@PutMapping("/update/{id}")
	public Doctor updateById(@RequestBody Doctor doctor,@PathVariable int id)
	{
		return hospitalService.updateById(doctor,id);
	}
	
}
