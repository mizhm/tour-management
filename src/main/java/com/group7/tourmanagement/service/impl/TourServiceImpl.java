package com.group7.tourmanagement.service.impl;

import com.group7.tourmanagement.service.TourService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class TourServiceImpl implements TourService {
    @Override
    public String tour(Model model) {
        return "frontend/tour-detail";
    }
}
