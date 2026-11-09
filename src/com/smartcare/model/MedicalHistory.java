package com.smartcare.model;

public class MedicalHistory {

    private String condition;
    private String diagnosisDate;
    private String treatment;

    public MedicalHistory(String condition, String diagnosisDate, String treatment) {
        this.condition = condition;
        this.diagnosisDate = diagnosisDate;
        this.treatment = treatment;
    }

    public String getCondition() {
        return condition;
    }

    public String getDiagnosisDate() {
        return diagnosisDate;
    }

    public String getTreatment() {
        return treatment;
    }
}