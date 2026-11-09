package com.smartcare.service;

import com.smartcare.model.Appointment;

public class AppointmentService {

    public void displayAppointment(Appointment appointment) {

        System.out.println("----- APPOINTMENT DETAILS -----");
        System.out.println("Doctor: " + appointment.getDoctorName());
        System.out.println("Date: " + appointment.getAppointmentDate());
        System.out.println("Time: " + appointment.getAppointmentTime());
        System.out.println("Purpose: " + appointment.getPurpose());
    }
}