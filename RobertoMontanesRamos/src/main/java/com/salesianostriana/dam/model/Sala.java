package com.salesianostriana.dam.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private int capacidad;

	@OneToMany(mappedBy = "sala", cascade = CascadeType.ALL, orphanRemoval = true) //estos atributos permiten que la sala se elimine y las entradas asociadas a ella también
	private List<Entrada> entradas = new ArrayList<>();
}