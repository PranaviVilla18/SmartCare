package com.smartcare.controller;

import com.smartcare.model.MedicalReport;
import com.smartcare.service.MedicalReportService;

public class MedicalReportController {

    private MedicalReportService medicalReportService = new MedicalReportService();

    public void showMedicalReport(MedicalReport report) {
        medicalReportService.displayMedicalReport(report);
    }
}