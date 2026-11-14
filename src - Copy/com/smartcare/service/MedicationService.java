package com.smartcare.service;

import com.smartcare.model.Medication;

public class MedicationService {

    public void displayMedicationDetails(Medication medication) {

        System.out.println("----- MEDICATION DETAILS -----");
        System.out.println("Medicine: " + medication.getMedicationName());
        System.out.println("Dosage: " + medication.getDosage());
        System.out.println("Frequency: " + medication.getFrequency());
        System.out.println("Duration: " + medication.getDuration() + " days");
    }
}