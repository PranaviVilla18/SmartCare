package com.smartcare.controller;

import com.smartcare.model.Prescription;
import com.smartcare.service.PrescriptionService;

public class PrescriptionController {

    private PrescriptionService prescriptionService = new PrescriptionService();

    public void showPrescription(Prescription prescription) {
        prescriptionService.displayPrescriptionDetails(prescription);
    }
}