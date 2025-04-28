package com.apollohospital.Apollo.Hospital.repository;

import com.apollohospital.Apollo.Hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
