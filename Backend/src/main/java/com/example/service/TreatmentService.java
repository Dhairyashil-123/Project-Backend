package com.example.service;

import java.util.List;

import com.example.pojo.Treatment;

public interface TreatmentService {
public Treatment registerTreatment(Treatment treatment);
	
	public List<Treatment> getTreatment(Treatment treatment);
}
