package com.vasee.hotelreservation.controller;

import com.vasee.hotelreservation.entity.Booking;
import com.vasee.hotelreservation.service.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService service;
    public BookingController(BookingService service) { this.service = service; }

    @GetMapping
    public String list(Model model) { model.addAttribute("bookings", service.findAll()); return "bookings/list"; }
    @GetMapping("/new")
    public String form(Model model) { model.addAttribute("booking", new Booking()); return "bookings/form"; }
    @PostMapping("/save")
    public String save(@ModelAttribute Booking booking) { service.save(booking); return "redirect:/bookings"; }
    @GetMapping("/cancel/{id}")
    public String cancel(@PathVariable String id) { service.cancelBooking(id); return "redirect:/bookings"; }
}
