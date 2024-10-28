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

    @Override
    public String search(Model model) {
        return "frontend/search";
    }

    @Override
    public String contact(Model model) {
        return "frontend/contact";
    }

    @Override
    public String about(Model model) {
        return "frontend/about";
    }

    @Override
    public String notFound(Model model) {
        return "frontend/404";
    }

    @Override
    public String faq(Model model) {
        return "frontend/faq";
    }
}
