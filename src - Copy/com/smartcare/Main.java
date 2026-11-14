
package com.smartcare;

import java.util.Scanner;

import com.smartcare.model.*;
import com.smartcare.controller.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Models
        User user = new User("Ananya", 20, "ananya@gmail.com", "9876543210");

        Medication medication = new Medication(
            "Paracetamol", "500mg", "Twice a day", 5
        );

        Prescription prescription = new Prescription(
            user, medication, "09-11-2026"
        );

        Reminder reminder = new Reminder(
            "08:00 AM", "09-11-2026", "Take Paracetamol"
        );

        HealthRecord healthRecord = new HealthRecord(
            "O+", 55.0, 160.0, "No known medical history"
        );

        Appointment appointment = new Appointment(
            "Dr. Sharma", "10-11-2026",
            "10:30 AM", "General Check-up"
        );

        Doctor doctor = new Doctor(
            "Dr. Sharma", "General Physician",
            "doctor@gmail.com", "9876543211"
        );

        MedicalHistory medicalHistory = new MedicalHistory(
            "Fever", "01-11-2026", "Medication and rest"
        );

        MedicalReport medicalReport = new MedicalReport(
            "MR101", "Blood Test Report",
            "08-11-2026", "Hemoglobin and blood count report"
        );

        EmergencyContact emergencyContact = new EmergencyContact(
            "Ravi Kumar", "Father", "9876543212"
        );

        // Controllers
        UserController userController = new UserController();
        MedicationController medicationController = new MedicationController();
        PrescriptionController prescriptionController = new PrescriptionController();
        ReminderController reminderController = new ReminderController();
        HealthRecordController healthRecordController = new HealthRecordController();
        AppointmentController appointmentController = new AppointmentController();
        DoctorController doctorController = new DoctorController();
        MedicalHistoryController medicalHistoryController = new MedicalHistoryController();
        MedicalReportController medicalReportController = new MedicalReportController();
        EmergencyContactController emergencyContactController = new EmergencyContactController();

        // Main Menu
        while (true) {

            System.out.println("\n========== SMARTCARE ==========");
            System.out.println("1. User Details");
            System.out.println("2. Medication Details");
            System.out.println("3. Prescription Details");
            System.out.println("4. Reminder Details");
            System.out.println("5. Health Record");
            System.out.println("6. Appointment Details");
            System.out.println("7. Doctor Details");
            System.out.println("8. Medical History");
            System.out.println("9. Medical Report");
            System.out.println("10. Emergency Contact");
            System.out.println("11. Exit");

            System.out.print("\nEnter your choice: ");
            System.out.flush();

            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Please enter a number.");
                continue;
            }

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number from 1 to 11.");
                continue;
            }

            System.out.println();

            switch (choice) {

                case 1:
                    userController.showUser(user);
                    break;

                case 2:
                    medicationController.showMedication(medication);
                    break;

                case 3:
                    prescriptionController.showPrescription(prescription);
                    break;

                case 4:
                    reminderController.showReminder(reminder);
                    break;

                case 5:
                    healthRecordController.showHealthRecord(healthRecord);
                    break;

                case 6:
                    appointmentController.showAppointment(appointment);
                    break;

                case 7:
                    doctorController.showDoctor(doctor);
                    break;

                case 8:
                    medicalHistoryController.showMedicalHistory(medicalHistory);
                    break;

                case 9:
                    medicalReportController.showMedicalReport(medicalReport);
                    break;

                case 10:
                    emergencyContactController.showEmergencyContact(emergencyContact);
                    break;

                case 11:
                    System.out.println("Thank you for using SmartCare!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Enter 1 to 11.");
            }

            System.out.println("\nPress Enter to return to the main menu...");
            sc.nextLine();
        }
    }
}
