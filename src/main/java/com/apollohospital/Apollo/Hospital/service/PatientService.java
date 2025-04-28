package com.apollohospital.Apollo.Hospital.service;

import com.apollohospital.Apollo.Hospital.dto.PatientInputDto;
import com.apollohospital.Apollo.Hospital.dto.PatientOutputDto;

import java.util.List;

public interface PatientService {
    public PatientOutputDto getDoctorById(Long id);
    public List<PatientOutputDto> getAllDoctor();
    public PatientOutputDto addPatient(PatientInputDto patientInputDto);
    public PatientOutputDto updatePatient(Long id, PatientInputDto patientInputDto);
    public String removePatient(Long id);
}
