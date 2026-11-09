package com.smartcare.service;

import com.smartcare.model.EmergencyContact;

public class EmergencyContactService {

    public void displayEmergencyContact(EmergencyContact contact) {

        System.out.println("----- EMERGENCY CONTACT -----");
        System.out.println("Name: " + contact.getContactName());
        System.out.println("Relationship: " + contact.getRelationship());
        System.out.println("Phone: " + contact.getPhone());
    }
}