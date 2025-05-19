package com.salesianostriana.dam.repository;

import com.salesianostriana.dam.model.Entrada;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface EntradaRepository extends JpaRepository<Entrada, Long> {List<Entrada> findByClienteContainingIgnoreCase(String cliente);


@Query("SELECT e FROM Entrada e WHERE LOWER(e.cliente) LIKE LOWER(concat('%', :query, '%')) OR " +
      "LOWER(e.sala.nombre) LIKE LOWER(concat('%', :query, '%'))")
List<Entrada> buscarEntradas(@Param("query") String query);
}
