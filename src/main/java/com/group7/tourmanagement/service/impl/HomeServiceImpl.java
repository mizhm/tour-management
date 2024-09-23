package com.group7.tourmanagement.service.impl;

import com.group7.tourmanagement.service.HomeService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public String home(Model model) {
        return "frontend/index";
    }
}
