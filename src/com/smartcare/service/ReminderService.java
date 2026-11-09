package com.smartcare.service;

import com.smartcare.model.Reminder;

public class ReminderService {

    public void displayReminder(Reminder reminder) {

        System.out.println("----- REMINDER DETAILS -----");
        System.out.println("Date: " + reminder.getReminderDate());
        System.out.println("Time: " + reminder.getReminderTime());
        System.out.println("Message: " + reminder.getMessage());
    }
}