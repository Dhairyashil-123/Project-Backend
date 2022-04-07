package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.Treatment;

@Repository
public interface TreatmentDao extends JpaRepository<Treatment, Integer> {

}
