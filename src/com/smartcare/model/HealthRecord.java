package com.smartcare.model;

public class HealthRecord {

    private String bloodGroup;
    private double weight;
    private double height;
    private String medicalHistory;

    public HealthRecord(String bloodGroup, double weight,
                        double height, String medicalHistory) {
        this.bloodGroup = bloodGroup;
        this.weight = weight;
        this.height = height;
        this.medicalHistory = medicalHistory;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}