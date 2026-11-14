package com.smartcare.controller;

import com.smartcare.model.Medication;
import com.smartcare.service.MedicationService;

public class MedicationController {

    private MedicationService medicationService = new MedicationService();

    public void showMedication(Medication medication) {
        medicationService.displayMedicationDetails(medication);
    }
}