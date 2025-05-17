package com.salesianostriana.dam.repository;

import com.salesianostriana.dam.model.Sala;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalaRepository extends JpaRepository<Sala, Long> {
 
 List<Sala> findByNombreContainingIgnoreCase(String nombre);
 

 @Query("SELECT s FROM Sala s WHERE LOWER(s.nombre) LIKE LOWER(concat('%', :query, '%'))")
 List<Sala> buscarSalas(@Param("query") String query);
}
