package com.group7.tourmanagement.service.impl;

import com.group7.tourmanagement.service.CheckoutService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Override
    public String checkout(Model model) {
        return "frontend/checkout";
    }
}
