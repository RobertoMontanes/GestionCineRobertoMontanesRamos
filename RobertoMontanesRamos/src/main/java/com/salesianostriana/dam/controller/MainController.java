package com.salesianostriana.dam.controller;

import com.salesianostriana.dam.model.Entrada;
import com.salesianostriana.dam.model.Sala;
import com.salesianostriana.dam.service.EntradaService;
import com.salesianostriana.dam.service.SalaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final EntradaService entradaService;
    private final SalaService salaService;

    @GetMapping("/")
    public String index(Model model) {
        List<Sala> salas = salaService.findAll();
        List<Entrada> entradas = entradaService.findAll();
        
        model.addAttribute("salas", salas);
        model.addAttribute("entradas", entradas);
        return "index";
    }
}