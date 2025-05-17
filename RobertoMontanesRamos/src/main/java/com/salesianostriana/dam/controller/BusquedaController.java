package com.salesianostriana.dam.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.salesianostriana.dam.model.Entrada;
import com.salesianostriana.dam.model.Sala;
import com.salesianostriana.dam.repository.EntradaRepository;
import com.salesianostriana.dam.repository.SalaRepository;

@Controller
public class BusquedaController {

    @Autowired
    private SalaRepository salaRepository;
    
    @Autowired
    private EntradaRepository entradaRepository;

    @GetMapping("/buscar")
    public String buscar(
        @RequestParam String query,
        @RequestParam String type,
        Model model) {
        
        if (query == null || query.trim().isEmpty()) {
            return "redirect:/"; 
        }
        
        if ("salas".equals(type)) {
            List<Sala> resultados = salaRepository.findByNombreContainingIgnoreCase(query);
            model.addAttribute("salas", resultados);
            return "admin/sala/listado"; 
        } else {
            List<Entrada> resultados = entradaRepository.findByClienteContainingIgnoreCase(query);
            model.addAttribute("entradas", resultados);
            return "admin/entrada/listado"; 
        }
    }
}
