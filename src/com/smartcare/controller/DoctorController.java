package com.smartcare.controller;

import com.smartcare.model.Doctor;
import com.smartcare.service.DoctorService;

public class DoctorController {

    private DoctorService doctorService = new DoctorService();

    public void showDoctor(Doctor doctor) {
        doctorService.displayDoctorDetails(doctor);
    }
}