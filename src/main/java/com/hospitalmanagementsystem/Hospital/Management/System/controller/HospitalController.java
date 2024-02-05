package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    HospitalService hospitalService = new HospitalService();

    // http://localhost:8080/hospital/getAllHospital --> GetMethod
    @GetMapping("/getAllHospital")
    public List<Hospital> getAllHospital(){
        return hospitalService.getAllHospital();
    }

    @PostMapping("/register")
    public String registerHospital(Hospital obj){
        hospitalService.registerHospital(obj);
        return "Hospital added successfully";
    }

}
