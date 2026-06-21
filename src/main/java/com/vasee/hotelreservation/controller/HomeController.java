package com.vasee.hotelreservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/customer")
    public String customerDashboard() {
        return "customer-dashboard";
    }

    @GetMapping("/manager")
    public String managerDashboard() {
        return "manager-dashboard";
    }
}
