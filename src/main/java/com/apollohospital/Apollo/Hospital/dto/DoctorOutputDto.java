package com.apollohospital.Apollo.Hospital.dto;

import com.apollohospital.Apollo.Hospital.enums.Gender;
import com.apollohospital.Apollo.Hospital.enums.Specialization;
import lombok.Data;

@Data
public class DoctorOutputDto {
    private  Long id;

    private String name;
    private Double salary;
    private Gender gender;
    private Specialization specialization;
    private Long mobile;
}
