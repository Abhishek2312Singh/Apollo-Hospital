package com.apollohospital.Apollo.Hospital.entity;

import com.apollohospital.Apollo.Hospital.enums.Symptoms;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Symptoms symptoms;
}
