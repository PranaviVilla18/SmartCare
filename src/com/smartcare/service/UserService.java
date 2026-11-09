package com.smartcare.service;

import com.smartcare.model.User;

public class UserService {

    public void displayUserDetails(User user) {

        System.out.println("----- USER DETAILS -----");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhone());
    }
}