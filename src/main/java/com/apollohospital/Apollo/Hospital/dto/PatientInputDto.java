package com.apollohospital.Apollo.Hospital.dto;

import com.apollohospital.Apollo.Hospital.enums.Symptoms;
import lombok.Data;

@Data
public class PatientInputDto {

    private String name;
    private Symptoms symptoms;
}
