package com.smartcare.model;

public class EmergencyContact {

    private String contactName;
    private String relationship;
    private String phone;

    public EmergencyContact(String contactName, String relationship, String phone) {
        this.contactName = contactName;
        this.relationship = relationship;
        this.phone = phone;
    }

    public String getContactName() {
        return contactName;
    }

    public String getRelationship() {
        return relationship;
    }

    public String getPhone() {
        return phone;
    }
}