package com.smartcare.controller;

import com.smartcare.model.HealthRecord;
import com.smartcare.service.HealthRecordService;

public class HealthRecordController {

    private HealthRecordService healthRecordService = new HealthRecordService();

    public void showHealthRecord(HealthRecord record) {
        healthRecordService.displayHealthRecord(record);
    }
}