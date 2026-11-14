package com.smartcare.model;

public class Reminder {

    private String reminderTime;
    private String reminderDate;
    private String message;

    public Reminder(String reminderTime, String reminderDate, String message) {
        this.reminderTime = reminderTime;
        this.reminderDate = reminderDate;
        this.message = message;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    public String getReminderDate() {
        return reminderDate;
    }

    public String getMessage() {
        return message;
    }
}