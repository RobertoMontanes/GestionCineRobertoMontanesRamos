package com.salesianostriana.dam.repository;

import com.salesianostriana.dam.model.Sala;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    
    // Ordenación por capacidad
    @Query("SELECT s FROM Sala s ORDER BY s.capacidad ASC")
    List<Sala> findAllOrderByCapacidadAsc();
    
    @Query("SELECT s FROM Sala s ORDER BY s.capacidad DESC")
    List<Sala> findAllOrderByCapacidadDesc();
    
    // Ordenación por entradas vendidas
    @Query("SELECT s FROM Sala s ORDER BY SIZE(s.entradas) ASC")
    List<Sala> findAllOrderByEntradasVendidasAsc();
    
    @Query("SELECT s FROM Sala s ORDER BY SIZE(s.entradas) DESC")
    List<Sala> findAllOrderByEntradasVendidasDesc();
    
    // Ordenación por nombre
    @Query("SELECT s FROM Sala s ORDER BY s.nombre ASC")
    List<Sala> findAllOrderByNombreAsc();
    
    @Query("SELECT s FROM Sala s ORDER BY s.nombre DESC")
    List<Sala> findAllOrderByNombreDesc();
}