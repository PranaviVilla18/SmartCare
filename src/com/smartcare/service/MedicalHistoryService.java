package com.smartcare.service;

import com.smartcare.model.MedicalHistory;

public class MedicalHistoryService {

    public void displayMedicalHistory(MedicalHistory history) {

        System.out.println("----- MEDICAL HISTORY -----");
        System.out.println("Condition: " + history.getCondition());
        System.out.println("Diagnosis Date: " + history.getDiagnosisDate());
        System.out.println("Treatment: " + history.getTreatment());
    }
}