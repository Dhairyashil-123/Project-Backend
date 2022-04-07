package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Appointment;

@Repository
public interface AppointmentDao  extends JpaRepository<Appointment, String> {

}
