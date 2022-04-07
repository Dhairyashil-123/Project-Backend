package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HospitalDao;
import com.example.pojo.Hospital;


@Service
public class HospitalServiceImpl implements HospitalService
{
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public Hospital registerHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitalDao.save(hospital);
	}

	@Override
	public List<Hospital> getHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitalDao.findAll();
	}

	
}
