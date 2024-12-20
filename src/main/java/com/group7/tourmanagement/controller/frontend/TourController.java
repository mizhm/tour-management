package com.group7.tourmanagement.controller.frontend;

import com.group7.tourmanagement.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TourController {
    @Autowired
    private TourService tourService;

    @GetMapping("/tour-detail")
    public String view(Model model) {
        return tourService.tour(model);
    }
}
