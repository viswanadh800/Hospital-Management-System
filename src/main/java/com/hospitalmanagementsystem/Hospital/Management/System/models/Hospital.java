package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Hospital {
    private UUID hospitalId;
    private String name;
    private List<Bed> beds;
    private List<Doctor> doctors;
    private List<Patient> patients;
    private Long contactNumber;

    public Hospital(UUID hospitalId, String name, List<Bed> bed, List<Doctor> doctors, List<Patient> patients, Long contactNumber, String email) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.beds = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public UUID getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(UUID hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bed> getBed() {
        return beds;
    }

    public void setBed(List<Bed> bed) {
        this.beds = bed;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;

}
