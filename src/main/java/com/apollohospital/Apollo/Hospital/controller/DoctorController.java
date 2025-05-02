package com.apollohospital.Apollo.Hospital.controller;

import com.apollohospital.Apollo.Hospital.dto.DoctorInputDto;
import com.apollohospital.Apollo.Hospital.dto.DoctorOutputDto;
import com.apollohospital.Apollo.Hospital.enums.Gender;
import com.apollohospital.Apollo.Hospital.service.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "http://localhost:3000/")
public class DoctorController {
    @Autowired
    DoctorServices doctorServices;

    @GetMapping("/all")
    public ResponseEntity<List<DoctorOutputDto>> getAllDoctor(){
        return new ResponseEntity<>(doctorServices.getAllDoctors(), HttpStatusCode.valueOf(200));
    }
    @GetMapping
    public ResponseEntity<DoctorOutputDto> getDoctorById(@RequestParam Long id){
        return new ResponseEntity<>(doctorServices.getDoctorById(id),HttpStatusCode.valueOf(200));
    }
    @PostMapping
    public ResponseEntity<DoctorOutputDto> addDoctor(@RequestBody DoctorInputDto doctorInputDto){
        return new ResponseEntity<>(doctorServices.addDoctor(doctorInputDto),HttpStatusCode.valueOf(200));
    }
    @PutMapping("/{id}")
    public ResponseEntity<DoctorOutputDto> updateDoctor(@PathVariable Long id,@RequestBody DoctorInputDto doctorInputDto){
        return  new ResponseEntity<>(doctorServices.updateDoctor(id,doctorInputDto),HttpStatusCode.valueOf(200));
    }
    @DeleteMapping("/{id}")
    public String removeDoctor(@PathVariable Long id){
        return doctorServices.removeDoctor(id);
    }
    @GetMapping("/search")
    public ResponseEntity<List<DoctorOutputDto>> getDoctorBySalary(@RequestParam Double salary){
        return new ResponseEntity<>(doctorServices.getDoctorBySalary(salary),HttpStatusCode.valueOf(200));
    }
    @GetMapping("/searchByGender")
    public ResponseEntity<List<DoctorOutputDto>> getDoctorByGender(@RequestParam Gender gender){
        return new ResponseEntity<>(doctorServices.getDoctorByGender(gender),HttpStatusCode.valueOf(200));
    }
    @GetMapping("/searchByName")
    public ResponseEntity<List<DoctorOutputDto>> searchByName(@RequestParam String name){
        return new ResponseEntity<>(doctorServices.searchDoctorByName(name),HttpStatusCode.valueOf(200));
    }
}
