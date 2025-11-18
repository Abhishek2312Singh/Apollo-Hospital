package com.apollohospital.Apollo.Hospital.entity;

import com.apollohospital.Apollo.Hospital.enums.Gender;
import com.apollohospital.Apollo.Hospital.enums.Symptoms;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Symptoms symptoms;

    @OneToOne
    @JoinColumn(name = "patient_insurance_id") //owning side
    private Insurance insurance;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
}
