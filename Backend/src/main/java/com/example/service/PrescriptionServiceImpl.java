package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PrescriptionDao;
import com.example.pojo.Prescription;


@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionDao prescriptionDao;

	@Override
	public Prescription registerPrescription(Prescription prescription) {
		// TODO Auto-generated method stub
		return prescriptionDao.save(prescription);
	}

	@Override
	public List<Prescription> getPrescription(Prescription prescription) {
		// TODO Auto-generated method stub
		return prescriptionDao.findAll();
	}

	
}
