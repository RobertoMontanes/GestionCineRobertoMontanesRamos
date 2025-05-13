package com.salesianostriana.dam.repository;

import com.salesianostriana.dam.model.Entrada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, Long> {
}