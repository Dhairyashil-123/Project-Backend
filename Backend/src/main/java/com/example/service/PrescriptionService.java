package com.example.service;

import java.util.List;

import com.example.pojo.Prescription;

public interface PrescriptionService {
public Prescription registerPrescription(Prescription prescription);
	
	public List<Prescription> getPrescription(Prescription prescription);
	
}
