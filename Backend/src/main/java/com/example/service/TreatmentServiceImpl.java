package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TreatmentDao;
import com.example.pojo.Treatment;


@Service
public class TreatmentServiceImpl implements TreatmentService {

	@Autowired
	private TreatmentDao treatmentDao;

	@Override
	public Treatment registerTreatment(Treatment treatment) {
		// TODO Auto-generated method stub
		return treatmentDao.save(treatment);
	}

	@Override
	public List<Treatment> getTreatment(Treatment treatment) {
		// TODO Auto-generated method stub
		return treatmentDao.findAll();
	}

	
}
