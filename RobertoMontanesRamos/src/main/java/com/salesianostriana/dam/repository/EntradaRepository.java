package com.salesianostriana.dam.repository;

import com.salesianostriana.dam.model.Entrada;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EntradaRepository extends JpaRepository<Entrada, Long> {
    
    // Ordenación por cliente
    @Query("SELECT e FROM Entrada e ORDER BY e.cliente ASC")
    List<Entrada> findAllOrderByClienteAsc();
    
    @Query("SELECT e FROM Entrada e ORDER BY e.cliente DESC")
    List<Entrada> findAllOrderByClienteDesc();
    
    // Ordenación por sala
    @Query("SELECT e FROM Entrada e ORDER BY e.sala.nombre ASC")
    List<Entrada> findAllOrderBySalaNombreAsc();
    
    @Query("SELECT e FROM Entrada e ORDER BY e.sala.nombre DESC")
    List<Entrada> findAllOrderBySalaNombreDesc();
    
    // Ordenación por fecha
    @Query("SELECT e FROM Entrada e ORDER BY e.fechaHora ASC")
    List<Entrada> findAllOrderByFechaAsc();
    
    @Query("SELECT e FROM Entrada e ORDER BY e.fechaHora DESC")
    List<Entrada> findAllOrderByFechaDesc();
    
    // Ordenación por precio
    @Query("SELECT e FROM Entrada e ORDER BY e.precio ASC")
    List<Entrada> findAllOrderByPrecioAsc();
    
    @Query("SELECT e FROM Entrada e ORDER BY e.precio DESC")
    List<Entrada> findAllOrderByPrecioDesc();
}