package com.apollohospital.Apollo.Hospital.repository;

import com.apollohospital.Apollo.Hospital.entity.Doctor;
import com.apollohospital.Apollo.Hospital.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    public List<Doctor> findBySalaryLessThan(Double salary);
    public List<Doctor> findByGender(Gender gender);

    public List<Doctor> findByNameLike(String name);
}
