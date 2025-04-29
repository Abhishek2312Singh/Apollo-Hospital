package com.apollohospital.Apollo.Hospital.controller;

import com.apollohospital.Apollo.Hospital.dto.PatientInputDto;
import com.apollohospital.Apollo.Hospital.dto.PatientOutputDto;
import com.apollohospital.Apollo.Hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/all")
    public ResponseEntity<List<PatientOutputDto>> getAllPatient(){
        return new ResponseEntity<>(patientService.getAllDoctor(), HttpStatusCode.valueOf(200));
    }
    @GetMapping
    public ResponseEntity<PatientOutputDto> getPatientById(@RequestParam Long id){
        return new ResponseEntity<>(patientService.getDoctorById(id),HttpStatusCode.valueOf(200));
    }
    @PostMapping
    public ResponseEntity<PatientOutputDto> addPatient(@RequestBody PatientInputDto patientInputDto){
        return new ResponseEntity<>(patientService.addPatient(patientInputDto),HttpStatusCode.valueOf(200));
    }
    @PutMapping("/{id}")
    public ResponseEntity<PatientOutputDto> updatePatient(@PathVariable Long id,@RequestBody PatientInputDto patientInputDto){
        return new ResponseEntity<>(patientService.updatePatient(id,patientInputDto),HttpStatusCode.valueOf(200));
    }
    @DeleteMapping
    public String removePatient(@RequestParam Long id){
        return patientService.removePatient(id);
    }
}
