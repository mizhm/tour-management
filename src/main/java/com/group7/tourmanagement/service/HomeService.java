package com.group7.tourmanagement.service;

import org.springframework.ui.Model;

public interface HomeService {
    String home(Model model);
    String search(Model model);
    String contact(Model model);
    String about(Model model);
    String notFound(Model model);
    String faq(Model model);
}
