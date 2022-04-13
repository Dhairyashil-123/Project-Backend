package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AppointmentDao;
import com.example.pojo.Appointment;



@Service
public class AppointmentServiceImpl implements AppointmentService
{
	@Autowired
	private AppointmentDao appointmentDao;

	@Override
	public Appointment registerAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentDao.save(appointment);
	}

	@Override
	public List<Appointment> getAppointment() {
		// TODO Auto-generated method stub
		return appointmentDao.findAll();
	}

	

	
}
