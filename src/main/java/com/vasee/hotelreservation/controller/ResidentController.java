package com.vasee.hotelreservation.controller;

import com.vasee.hotelreservation.entity.NRIResident;
import com.vasee.hotelreservation.entity.RIResident;
import com.vasee.hotelreservation.service.NRIResidentService;
import com.vasee.hotelreservation.service.RIResidentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/residents")
public class ResidentController {
    private final RIResidentService riService;
    private final NRIResidentService nriService;

    public ResidentController(RIResidentService riService, NRIResidentService nriService) {
        this.riService = riService;
        this.nriService = nriService;
    }

    @GetMapping("/ri/new")
    public String showRIForm(Model model) { model.addAttribute("resident", new RIResident()); return "residents/ri-form"; }
    @PostMapping("/ri/save")
    public String saveRI(@ModelAttribute RIResident resident) { riService.save(resident); return "redirect:/residents/ri"; }
    @GetMapping("/ri")
    public String listRI(Model model) { model.addAttribute("residents", riService.findAll()); return "residents/ri-list"; }
    @GetMapping("/ri/delete/{id}")
    public String deleteRI(@PathVariable String id) { riService.deleteById(id); return "redirect:/residents/ri"; }

    @GetMapping("/nri/new")
    public String showNRIForm(Model model) { model.addAttribute("resident", new NRIResident()); return "residents/nri-form"; }
    @PostMapping("/nri/save")
    public String saveNRI(@ModelAttribute NRIResident resident) { nriService.save(resident); return "redirect:/residents/nri"; }
    @GetMapping("/nri")
    public String listNRI(Model model) { model.addAttribute("residents", nriService.findAll()); return "residents/nri-list"; }
    @GetMapping("/nri/delete/{id}")
    public String deleteNRI(@PathVariable String id) { nriService.deleteById(id); return "redirect:/residents/nri"; }
}
