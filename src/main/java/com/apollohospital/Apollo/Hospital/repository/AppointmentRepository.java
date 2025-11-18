package com.apollohospital.Apollo.Hospital.repository;

import com.apollohospital.Apollo.Hospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}