package com.smartcare.service;

import com.smartcare.model.Doctor;

public class DoctorService {

    public void displayDoctorDetails(Doctor doctor) {

        System.out.println("----- DOCTOR DETAILS -----");
        System.out.println("Name: " + doctor.getDoctorName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Email: " + doctor.getEmail());
        System.out.println("Phone: " + doctor.getPhone());
    }
}