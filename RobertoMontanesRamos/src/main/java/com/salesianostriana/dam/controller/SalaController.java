package com.salesianostriana.dam.controller;

import com.salesianostriana.dam.model.Sala;
import com.salesianostriana.dam.service.SalaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/sala")
@RequiredArgsConstructor
public class SalaController {

    private final SalaService salaService;

    @GetMapping("/")
    public String listSalas(Model model) {
        model.addAttribute("salas", salaService.findAll());
        return "sala/list-salas";
    }

    @GetMapping("/nueva")
    public String showForm(Model model) {
        model.addAttribute("sala", new Sala());
        return "sala/sala-form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute("sala") Sala sala) {
        salaService.save(sala);
        return "redirect:/admin/sala/";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("sala", salaService.findById(id).orElse(null));
        return "sala/sala-form";
    }

    @GetMapping("/borrar/{id}")
    public String delete(@PathVariable("id") Long id) {
        salaService.deleteById(id);
        return "redirect:/admin/sala/";
    }
}