package com.smartcare.service;

import com.smartcare.model.Prescription;

public class PrescriptionService {

    public void displayPrescriptionDetails(Prescription prescription) {

        System.out.println("----- PRESCRIPTION DETAILS -----");
        System.out.println("Patient: " + prescription.getUser().getName());
        System.out.println("Medication: " + prescription.getMedication().getMedicationName());
        System.out.println("Date: " + prescription.getPrescriptionDate());
    }
}