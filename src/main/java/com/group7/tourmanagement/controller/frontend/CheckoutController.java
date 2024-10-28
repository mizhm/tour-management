package com.group7.tourmanagement.controller.frontend;

import com.group7.tourmanagement.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;

    @RequestMapping("/checkout")
    public String checkout(Model model) {
        return checkoutService.checkout(model);
    }
}
