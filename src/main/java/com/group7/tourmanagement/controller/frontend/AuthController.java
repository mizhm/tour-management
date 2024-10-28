package com.group7.tourmanagement.controller.frontend;

import com.group7.tourmanagement.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthController {
    @Autowired
    private AuthService authService;

    @GetMapping("/login")
    public String login(Model model) {
        return authService.login(model);
    }

    @GetMapping("/register")
    public String register(Model model) {
        return authService.register(model);
    }
}
