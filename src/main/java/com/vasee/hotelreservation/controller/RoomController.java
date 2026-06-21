package com.vasee.hotelreservation.controller;

import com.vasee.hotelreservation.entity.Room;
import com.vasee.hotelreservation.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService service;
    public RoomController(RoomService service) { this.service = service; }

    @GetMapping
    public String list(Model model) { model.addAttribute("rooms", service.findAll()); return "rooms/list"; }
    @GetMapping("/available")
    public String available(Model model) { model.addAttribute("rooms", service.findAvailableRooms()); return "rooms/list"; }
    @GetMapping("/new")
    public String form(Model model) { model.addAttribute("room", new Room()); return "rooms/form"; }
    @PostMapping("/save")
    public String save(@ModelAttribute Room room) { service.save(room); return "redirect:/rooms"; }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) { service.deleteById(id); return "redirect:/rooms"; }
}
