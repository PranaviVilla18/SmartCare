package com.smartcare.model;

public class Appointment {

    private String doctorName;
    private String appointmentDate;
    private String appointmentTime;
    private String purpose;

    public Appointment(String doctorName, String appointmentDate,
                       String appointmentTime, String purpose) {
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.purpose = purpose;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getPurpose() {
        return purpose;
    }
}