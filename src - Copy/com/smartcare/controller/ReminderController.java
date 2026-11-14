package com.smartcare.controller;

import com.smartcare.model.Reminder;
import com.smartcare.service.ReminderService;

public class ReminderController {

    private ReminderService reminderService = new ReminderService();

    public void showReminder(Reminder reminder) {
        reminderService.displayReminder(reminder);
    }
}