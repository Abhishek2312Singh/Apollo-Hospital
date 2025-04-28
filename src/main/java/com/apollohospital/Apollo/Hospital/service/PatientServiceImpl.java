package com.apollohospital.Apollo.Hospital.service;

import com.apollohospital.Apollo.Hospital.dto.PatientInputDto;
import com.apollohospital.Apollo.Hospital.dto.PatientOutputDto;
import com.apollohospital.Apollo.Hospital.entity.Patient;
import com.apollohospital.Apollo.Hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientRepository patientRepository;
    @Override
    public PatientOutputDto getDoctorById(Long id) {
        Patient patient = patientRepository.findById(id).orElse(null);
        PatientOutputDto patientOutputDto = new PatientOutputDto();

        patientOutputDto.setId(patient.getId());
        patientOutputDto.setName(patient.getName());
        patientOutputDto.setSymptoms(patient.getSymptoms());

        return  patientOutputDto;
    }

    @Override
    public List<PatientOutputDto> getAllDoctor() {
        List<PatientOutputDto> patientOutputDtoList = new ArrayList<>();
        List<Patient> patients = patientRepository.findAll();
        for(Patient patient : patients){
            PatientOutputDto patientOutputDto = new PatientOutputDto();
            patientOutputDto.setId(patient.getId());
            patientOutputDto.setName(patient.getName());
            patientOutputDto.setSymptoms(patient.getSymptoms());
            patientOutputDto.setGender(patient.getGender());

            patientOutputDtoList.add(patientOutputDto);
        }
        return patientOutputDtoList;
    }

    @Override
    public PatientOutputDto addPatient(PatientInputDto patientInputDto) {
        Patient patient = new Patient();
        patient.setName(patientInputDto.getName());
        patient.setSymptoms(patientInputDto.getSymptoms());
        patient.setGender(patientInputDto.getGender());
        patient = patientRepository.save(patient);

        PatientOutputDto patientOutputDto = new PatientOutputDto();
        patientOutputDto.setId(patient.getId());
        patientOutputDto.setName(patient.getName());
        patientOutputDto.setSymptoms(patient.getSymptoms());
        patientOutputDto.setGender(patient.getGender());

        return patientOutputDto;
    }

    @Override
    public PatientOutputDto updatePatient(Long id, PatientInputDto patientInputDto) {
        Patient patient = patientRepository.findById(id).orElse(null);
        patient.setName(patientInputDto.getName());
        patient.setSymptoms(patientInputDto.getSymptoms());
        patient.setGender(patientInputDto.getGender());

        patient = patientRepository.save(patient);

        PatientOutputDto patientOutputDto = new PatientOutputDto();
        patientOutputDto.setId(patient.getId());
        patientOutputDto.setName(patient.getName());
        patientOutputDto.setSymptoms(patient.getSymptoms());
        patientOutputDto.setGender(patient.getGender());

        return patientOutputDto;
    }

    @Override
    public String removePatient(Long id) {
        String name = patientRepository.findById(id).orElse(null).getName();
        patientRepository.deleteById(id);
        return "Patient Id : " + id + "\nPatient Name : " + name + "\nRemoved Successfully!!";
    }
}
