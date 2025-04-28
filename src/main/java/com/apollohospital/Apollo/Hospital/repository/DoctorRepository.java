package com.apollohospital.Apollo.Hospital.repository;

import com.apollohospital.Apollo.Hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
