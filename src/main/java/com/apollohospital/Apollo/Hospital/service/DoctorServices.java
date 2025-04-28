package com.apollohospital.Apollo.Hospital.service;

import com.apollohospital.Apollo.Hospital.dto.DoctorInputDto;
import com.apollohospital.Apollo.Hospital.dto.DoctorOutputDto;

import java.util.List;

public interface DoctorServices {
    public List<DoctorOutputDto> getAllDoctors();
    public DoctorOutputDto getDoctorById(Long id);
    public DoctorOutputDto addDoctor(DoctorInputDto doctorInputDto);
    public DoctorOutputDto updateDoctor(Long id, DoctorInputDto doctorInputDto);
    public String removeDoctor(Long id);
}
