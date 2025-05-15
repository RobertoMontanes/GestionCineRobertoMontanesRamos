package com.salesianostriana.dam.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactoController {

	@GetMapping("/contacto")
	public String mostrarContacto(Model model) {
	    List<String> imagenes = Arrays.asList(
	        "https://images.unsplash.com/photo-1489599849927-2ee91cede3ba?ixlib=rb-4.0.3",
	        "https://images.unsplash.com/photo-1517604931442-7e0c8ed2963c?ixlib=rb-4.0.3",
	        "https://images.unsplash.com/photo-1536440136628-849c177e76a1?ixlib=rb-4.0.3"
	    );
	    model.addAttribute("imagenes", imagenes);
	    return "contacto";
	}
}