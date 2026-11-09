package com.smartcare.service;

import com.smartcare.model.MedicalReport;

public class MedicalReportService {

    public void displayMedicalReport(MedicalReport report) {

        System.out.println("----- MEDICAL REPORT -----");
        System.out.println("Report ID: " + report.getReportId());
        System.out.println("Report Name: " + report.getReportName());
        System.out.println("Report Date: " + report.getReportDate());
        System.out.println("Description: " + report.getDescription());
    }
}