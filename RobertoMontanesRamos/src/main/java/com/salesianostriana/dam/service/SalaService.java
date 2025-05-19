package com.salesianostriana.dam.service;

import com.salesianostriana.dam.model.Sala;
import com.salesianostriana.dam.repository.SalaRepository;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SalaService extends BaseService<Sala, Long, SalaRepository> {

	public SalaService(SalaRepository repo) {
		super(repo);
	}

	public List<Sala> findAllOrdered(String sortBy, String direction) {
		switch (sortBy) {
		case "capacidad":
			return direction.equalsIgnoreCase("asc") ? repository.findAllOrderByCapacidadAsc()
					: repository.findAllOrderByCapacidadDesc();
		case "entradas":
			return direction.equalsIgnoreCase("asc") ? repository.findAllOrderByEntradasVendidasAsc()
					: repository.findAllOrderByEntradasVendidasDesc();
		default:
			return direction.equalsIgnoreCase("asc") ? repository.findAll(Sort.by(Sort.Direction.ASC, "id"))
					: repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
		}
	}
}
