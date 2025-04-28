package com.apollohospital.Apollo.Hospital.entity;

import com.apollohospital.Apollo.Hospital.enums.Gender;
import com.apollohospital.Apollo.Hospital.enums.Specialization;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;
    private Double salary;
    private Gender gender;
    private Specialization specialization;
    private Long mobile;
}
