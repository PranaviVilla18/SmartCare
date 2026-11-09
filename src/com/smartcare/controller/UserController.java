package com.smartcare.controller;

import com.smartcare.model.User;
import com.smartcare.service.UserService;

public class UserController {

    private UserService userService = new UserService();

    public void showUser(User user) {
        userService.displayUserDetails(user);
    }
}