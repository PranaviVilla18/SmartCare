package com.smartcare.model;

public class MedicalReport {

    private String reportId;
    private String reportName;
    private String reportDate;
    private String description;

    public MedicalReport(String reportId, String reportName,
                         String reportDate, String description) {
        this.reportId = reportId;
        this.reportName = reportName;
        this.reportDate = reportDate;
        this.description = description;
    }

    public String getReportId() {
        return reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public String getReportDate() {
        return reportDate;
    }

    public String getDescription() {
        return description;
    }
}