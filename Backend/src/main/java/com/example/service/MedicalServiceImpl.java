package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MedicalDao;
import com.example.pojo.Medical;

@Service
public class MedicalServiceImpl implements MedicalService {
	@Autowired
	private MedicalDao medicalDao;

	@Override
	public Medical registerMedical(Medical medical) {
		// TODO Auto-generated method stub
		return medicalDao.save(medical);
	}

	@Override
	public List<Medical> getMedical(Medical medical) {
		// TODO Auto-generated method stub
		return medicalDao.findAll();
	}

	
}
