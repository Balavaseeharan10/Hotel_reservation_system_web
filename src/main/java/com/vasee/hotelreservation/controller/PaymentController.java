package com.vasee.hotelreservation.controller;

import com.vasee.hotelreservation.entity.Payment;
import com.vasee.hotelreservation.service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService service;
    public PaymentController(PaymentService service) { this.service = service; }

    @GetMapping
    public String list(Model model) { model.addAttribute("payments", service.findAll()); return "payments/list"; }
    @GetMapping("/new")
    public String form(Model model) { model.addAttribute("payment", new Payment()); return "payments/form"; }
    @PostMapping("/save")
    public String save(@ModelAttribute Payment payment) { service.save(payment); return "redirect:/payments"; }
}
