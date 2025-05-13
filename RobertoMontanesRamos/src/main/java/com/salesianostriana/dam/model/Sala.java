package com.salesianostriana.dam.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private int capacidad;

    @OneToMany(mappedBy = "sala")
    @Builder.Default
    private List<Entrada> entradas = new ArrayList<>();
}