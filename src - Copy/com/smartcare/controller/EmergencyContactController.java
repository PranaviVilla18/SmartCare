package com.smartcare.controller;

import com.smartcare.model.EmergencyContact;
import com.smartcare.service.EmergencyContactService;

public class EmergencyContactController {

    private EmergencyContactService emergencyContactService = new EmergencyContactService();

    public void showEmergencyContact(EmergencyContact contact) {
        emergencyContactService.displayEmergencyContact(contact);
    }
}