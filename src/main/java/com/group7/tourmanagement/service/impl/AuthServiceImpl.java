package com.group7.tourmanagement.service.impl;

import com.group7.tourmanagement.service.AuthService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String profile(Model model) {
        return "frontend/auth/profile";
    }

    @Override
    public String login(Model model) {
        return "frontend/auth/login";
    }

    @Override
    public String logout(Model model) {
        return "";
    }

    @Override
    public String register(Model model) {
        return "frontend/auth/register";
    }
}
