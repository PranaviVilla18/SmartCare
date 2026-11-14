package com.smartcare.controller;

import com.smartcare.model.MedicalHistory;
import com.smartcare.service.MedicalHistoryService;

public class MedicalHistoryController {

    private MedicalHistoryService medicalHistoryService = new MedicalHistoryService();

    public void showMedicalHistory(MedicalHistory history) {
        medicalHistoryService.displayMedicalHistory(history);
    }
}