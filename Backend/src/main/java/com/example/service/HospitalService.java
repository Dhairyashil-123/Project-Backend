package com.example.service;

import java.util.List;

import com.example.pojo.Hospital;



public interface HospitalService {
public Hospital registerHospital(Hospital hospital);
	
	public List<Hospital> getHospital(Hospital hospital);
}
