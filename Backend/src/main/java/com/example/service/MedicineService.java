package com.example.service;

import java.util.List;

import com.example.pojo.Medicine;



public interface MedicineService {
public Medicine registerMedicine(Medicine medicine);
	
	public List<Medicine> getMedicine(Medicine medicine);
	
}
