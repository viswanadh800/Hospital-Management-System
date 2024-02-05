package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;
public class Doctor {
    private UUID docId;
    private String name;
    private String degree;
    private List<Patient> patients;
    private UUID hospitalId;

    public Doctor(UUID docId, String name, String degree, List<Patient> patients, UUID hospitalId) {
        this.docId = docId;
        this.name = name;
        this.degree = degree;
        this.patients = new ArrayList<>();
        this.hospitalId = hospitalId;
    }
}
