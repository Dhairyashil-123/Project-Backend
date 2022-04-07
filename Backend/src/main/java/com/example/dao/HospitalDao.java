package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Hospital;

@Repository
public interface HospitalDao extends JpaRepository<Hospital, Integer> {

}
