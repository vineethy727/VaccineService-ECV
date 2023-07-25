package com.vaccine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccine.model.VaccineCenter;

@Repository
public interface VaccineCenterRepo extends JpaRepository<VaccineCenter, Integer> {

}
