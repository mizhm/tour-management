package com.group7.tourmanagement.controller.frontend;

import com.group7.tourmanagement.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping
    public String homePage(Model model) {
        return homeService.home(model);
    }

    @GetMapping("/search")
    public String search(Model model) {
        return homeService.search(model);
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return homeService.contact(model);
    }

    @GetMapping("/about")
    public String about(Model model) {
        return homeService.about(model);
    }

    @GetMapping("/404")
    public String notFound(Model model) {
        return homeService.notFound(model);
    }

    @GetMapping("/faq")
    public String faq(Model model) {
        return homeService.faq(model);
    }
}
