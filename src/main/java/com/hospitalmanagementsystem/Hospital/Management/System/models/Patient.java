package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.UUID;

public class Patient {
    private UUID pId;
    private String name;
    private String address;
    private String disease;
    private Long contactNumber;

    public Patient(UUID pId, String name, String address, String disease, Long contactNumber, UUID docId, int age, String emailId) {
        this.pId = pId;
        this.name = name;
        this.address = address;
        this.disease = disease;
        this.contactNumber = contactNumber;
        this.docId = docId;
        this.age = age;
        this.emailId = emailId;
    }

    public UUID getpId() {
        return pId;
    }

    public void setpId(UUID pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public UUID getDocId() {
        return docId;
    }

    public void setDocId(UUID docId) {
        this.docId = docId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    private UUID docId;
    private int age;
    private String emailId;

}
