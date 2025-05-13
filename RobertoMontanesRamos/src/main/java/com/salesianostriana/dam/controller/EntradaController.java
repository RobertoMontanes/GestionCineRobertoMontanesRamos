package com.salesianostriana.dam.controller;

import com.salesianostriana.dam.model.Entrada;
import com.salesianostriana.dam.model.Sala;
import com.salesianostriana.dam.service.EntradaService;
import com.salesianostriana.dam.service.SalaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/admin/entrada")
@RequiredArgsConstructor
public class EntradaController {

    private final EntradaService entradaService;
    private final SalaService salaService;

    @GetMapping("/")
    public String listEntradas(Model model) {
        model.addAttribute("entradas", entradaService.findAll());
        return "entrada/list-entradas";
    }

    @GetMapping("/nueva")
    public String showForm(Model model) {
        model.addAttribute("entrada", new Entrada());
        model.addAttribute("salas", salaService.findAll());
        return "entrada/entrada-form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute("entrada") Entrada entrada, 
                        @RequestParam("salaId") Long salaId) {
        Sala sala = salaService.findById(salaId).orElse(null);
        entrada.setSala(sala);
        entrada.setFechaHora(LocalDateTime.now());
        entradaService.save(entrada);
        return "redirect:/admin/entrada/";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Entrada entrada = entradaService.findById(id).orElse(null);
        model.addAttribute("entrada", entrada);
        model.addAttribute("salas", salaService.findAll());
        return "entrada/entrada-form";
    }

    @GetMapping("/borrar/{id}")
    public String delete(@PathVariable("id") Long id) {
        entradaService.deleteById(id);
        return "redirect:/admin/entrada/";
    }
}