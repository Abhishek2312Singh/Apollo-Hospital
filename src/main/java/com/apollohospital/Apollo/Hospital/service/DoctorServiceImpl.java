package com.apollohospital.Apollo.Hospital.service;

import com.apollohospital.Apollo.Hospital.dto.DoctorInputDto;
import com.apollohospital.Apollo.Hospital.dto.DoctorOutputDto;
import com.apollohospital.Apollo.Hospital.entity.Doctor;
import com.apollohospital.Apollo.Hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorServices {
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<DoctorOutputDto> getAllDoctors() {
        List<DoctorOutputDto> doctorOutputDtoList = new ArrayList<>();
        List<Doctor> doctors = doctorRepository.findAll();
        for(Doctor doctor : doctors){
            DoctorOutputDto doctorOutputDto = new DoctorOutputDto();

            doctorOutputDto.setId(doctor.getId());
            doctorOutputDto.setName((doctor.getName()));
            doctorOutputDto.setGender(doctor.getGender());
            doctorOutputDto.setSalary(doctor.getSalary());
            doctorOutputDto.setSpecialization(doctor.getSpecialization());
            doctorOutputDto.setMobile(doctor.getMobile());

            doctorOutputDtoList.add(doctorOutputDto);
        }
        return doctorOutputDtoList;
    }

    @Override
    public DoctorOutputDto getDoctorById(Long id) {
        DoctorOutputDto doctorOutputDto = new DoctorOutputDto();
        Doctor doctor = doctorRepository.findById(id).orElse(null);

        doctorOutputDto.setId(doctor.getId());
        doctorOutputDto.setName((doctor.getName()));
        doctorOutputDto.setGender(doctor.getGender());
        doctorOutputDto.setSalary(doctor.getSalary());
        doctorOutputDto.setSpecialization(doctor.getSpecialization());
        doctorOutputDto.setMobile(doctor.getMobile());

        return doctorOutputDto;
    }

    @Override
    public DoctorOutputDto addDoctor(DoctorInputDto doctorInputDto) {
        Doctor doctor = new Doctor();

        doctor.setName(doctorInputDto.getName());
        doctor.setGender(doctorInputDto.getGender());
        doctor.setSpecialization(doctorInputDto.getSpecialization());
        doctor.setSalary(doctorInputDto.getSalary());
        doctor.setMobile(doctorInputDto.getMobile());

        doctor = doctorRepository.save(doctor);

        DoctorOutputDto doctorOutputDto = new DoctorOutputDto();

        doctorOutputDto.setId(doctor.getId());
        doctorOutputDto.setName((doctor.getName()));
        doctorOutputDto.setGender(doctor.getGender());
        doctorOutputDto.setSalary(doctor.getSalary());
        doctorOutputDto.setSpecialization(doctor.getSpecialization());
        doctorOutputDto.setMobile(doctor.getMobile());

        return doctorOutputDto;
    }

    @Override
    public DoctorOutputDto updateDoctor(Long id, DoctorInputDto doctorInputDto) {
        Doctor doctor = doctorRepository.findById(id).orElse(null);

        doctor.setName(doctorInputDto.getName());
        doctor.setGender(doctorInputDto.getGender());
        doctor.setSpecialization(doctorInputDto.getSpecialization());
        doctor.setSalary(doctorInputDto.getSalary());
        doctor.setMobile(doctorInputDto.getMobile());

        doctor = doctorRepository.save(doctor);

        DoctorOutputDto doctorOutputDto = new DoctorOutputDto();

        doctorOutputDto.setId(doctor.getId());
        doctorOutputDto.setName((doctor.getName()));
        doctorOutputDto.setGender(doctor.getGender());
        doctorOutputDto.setSalary(doctor.getSalary());
        doctorOutputDto.setSpecialization(doctor.getSpecialization());
        doctorOutputDto.setMobile(doctor.getMobile());

        return doctorOutputDto;
    }

    @Override
    public String removeDoctor(Long id) {
        String name = doctorRepository.findById(id).orElse(null).getName();
        doctorRepository.deleteById(id);
        return "Doctor Id : " + id + "\nDoctor name : " + name + "\nRemoved Successfully!!";
    }
}
