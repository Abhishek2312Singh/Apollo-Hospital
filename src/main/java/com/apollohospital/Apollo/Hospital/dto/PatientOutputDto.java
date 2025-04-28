package com.apollohospital.Apollo.Hospital.dto;

import com.apollohospital.Apollo.Hospital.enums.Symptoms;
import lombok.Data;

@Data
public class PatientOutputDto {
    private Long id;
    private String name;
    private Symptoms symptoms;
}
