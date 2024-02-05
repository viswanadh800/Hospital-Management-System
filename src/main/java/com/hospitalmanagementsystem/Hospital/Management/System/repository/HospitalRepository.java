package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class HospitalRepository {
    HashMap<UUID, Hospital> hospitalDB;

    public HospitalRepository() {
        this.hospitalDB = new HashMap<>();
    }

    public List<Hospital> getAllHospital(){
        ArrayList<Hospital> hospitals= new ArrayList<>();
        for(UUID id: hospitalDB.keySet())
            hospitals.add(hospitalDB.get(id));
        return hospitals;
    }
    public void registerHospital(Hospital hospital){
        UUID hosId=hospital.getHospitalId();
        hospitalDB.put(hosId,hospital);
    }
}
