package com.salesianostriana.dam.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cliente;
    private LocalDateTime fechaHora;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;

    // Añade estos métodos si no los tienes
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}