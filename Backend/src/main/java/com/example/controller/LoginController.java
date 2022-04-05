package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.pojo.Admin;
import com.example.pojo.Doctor;
import com.example.pojo.Patient;
//import com.example.service.AdminServiceImpl;
import com.example.service.DoctorServiceImpl;
import com.example.service.PatientServiceImpl;

@CrossOrigin(origins  = "http://localhost:3000")
@RestController
@RequestMapping("/login")
public class LoginController
{

	@Autowired
	private PatientServiceImpl patientService;
	
	
	@PostMapping("/patient")
	public String loginAuthentication(@RequestBody Patient patient)
	{ 
		System.out.println("Fired login controller");
		
		List<Patient> patientList = patientService.findByUsernameAndPassword(patient);
		
		
		for(Patient patientObj : patientList)
		{
			if(patientObj.getUsername().equals(patient.getUsername()) && patientObj.getPassword().equals(patient.getPassword()))
			{
				return "valid";
			}
		}
		return "invalid";
	}
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@PostMapping("/doctor")
	public String loginAuthentication(@RequestBody Doctor doctor)
	{ 
		System.out.println("Fired login controller");
		
		List<Doctor> doctorList = doctorService.findByUsernameAndPassword(doctor);
		
		
		for(Doctor doctorObj : doctorList)
		{
			if(doctorObj.getUsername().equals(doctor.getUsername()) && doctorObj.getPassword().equals(doctor.getPassword()))
			{
				return "valid";
			}
		}
		return "invalid";
	}
	
//	@Autowired
//	private AdminServiceImpl adminService;
//	
//	@PostMapping("/admin")
//	public String loginAuthentication(@RequestBody Admin admin)
//	{ 
//		System.out.println("Fired login controller");
//		
//		List<Admin> adminList = adminService.findByUsernameAndPassword(admin);
//		
//		
//		for(Admin adminObj : adminList)
//		{
//			if(adminObj.getUsername().equals(admin.getUsername()) && adminObj.getPassword().equals(admin.getPassword()))
//			{
//				return "valid";
//			}
//		}
//		return "invalid";
//	}
}
