package com.salesianostriana.dam.repository;

import com.salesianostriana.dam.model.Sala;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {
    
    // Ordenación por capacidad
    @Query("SELECT s FROM Sala s ORDER BY s.capacidad ASC")
    List<Sala> findAllOrderByCapacidadAsc();
    
    @Query("SELECT s FROM Sala s ORDER BY s.capacidad DESC")
    List<Sala> findAllOrderByCapacidadDesc();
    
    // Ordenación por número de entradas vendidas
    @Query("SELECT s FROM Sala s LEFT JOIN s.entradas e GROUP BY s.id ORDER BY COUNT(e) ASC")
    List<Sala> findAllOrderByEntradasVendidasAsc();
    
    @Query("SELECT s FROM Sala s LEFT JOIN s.entradas e GROUP BY s.id ORDER BY COUNT(e) DESC")
    List<Sala> findAllOrderByEntradasVendidasDesc();
}