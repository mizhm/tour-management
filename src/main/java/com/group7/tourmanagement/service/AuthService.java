package com.group7.tourmanagement.service;

import org.springframework.ui.Model;

public interface AuthService {
    String profile(Model model);
    String login(Model model);
    String logout(Model model);
    String register(Model model);
}
