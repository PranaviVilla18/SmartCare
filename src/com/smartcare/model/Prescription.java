package com.smartcare.model;

public class Prescription {

    private User user;
    private Medication medication;
    private String prescriptionDate;

    public Prescription(User user, Medication medication, String prescriptionDate) {
        this.user = user;
        this.medication = medication;
        this.prescriptionDate = prescriptionDate;
    }

    public User getUser() {
        return user;
    }

    public Medication getMedication() {
        return medication;
    }

    public String getPrescriptionDate() {
        return prescriptionDate;
    }
}