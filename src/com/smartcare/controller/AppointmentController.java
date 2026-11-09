package com.smartcare.controller;

import com.smartcare.model.Appointment;
import com.smartcare.service.AppointmentService;

public class AppointmentController {

    private AppointmentService appointmentService = new AppointmentService();

    public void showAppointment(Appointment appointment) {
        appointmentService.displayAppointment(appointment);
    }
}