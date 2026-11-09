package com.smartcare.model;

public class Doctor {

    private String doctorName;
    private String specialization;
    private String email;
    private String phone;

    public Doctor(String doctorName, String specialization,
                  String email, String phone) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.email = email;
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}