package com.smartcare.model;

public class Medication {

    private String medicationName;
    private String dosage;
    private String frequency;
    private int duration;

    public Medication(String medicationName, String dosage,
                       String frequency, int duration) {
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.duration = duration;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public int getDuration() {
        return duration;
    }
}