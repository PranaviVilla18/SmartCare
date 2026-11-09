package com.smartcare.service;

import com.smartcare.model.HealthRecord;

public class HealthRecordService {

    public void displayHealthRecord(HealthRecord record) {

        System.out.println("----- HEALTH RECORD -----");
        System.out.println("Blood Group: " + record.getBloodGroup());
        System.out.println("Weight: " + record.getWeight() + " kg");
        System.out.println("Height: " + record.getHeight() + " cm");
        System.out.println("Medical History: " + record.getMedicalHistory());
    }
}