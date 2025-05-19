package com.salesianostriana.dam.service;

import com.salesianostriana.dam.model.Entrada;
import com.salesianostriana.dam.repository.EntradaRepository;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EntradaService extends BaseService<Entrada, Long, EntradaRepository> {

	public EntradaService(EntradaRepository repo) {
		super(repo);
	}

	public List<Entrada> findAllOrdered(String sortBy, String direction) {
		switch (sortBy) {
		case "cliente":
			return direction.equalsIgnoreCase("asc") ? repository.findAllOrderByClienteAsc()
					: repository.findAllOrderByClienteDesc();
		case "sala":
			return direction.equalsIgnoreCase("asc") ? repository.findAllOrderBySalaAsc()
					: repository.findAllOrderBySalaDesc();
		case "fecha":
			return direction.equalsIgnoreCase("asc") ? repository.findAllOrderByFechaAsc()
					: repository.findAllOrderByFechaDesc();
		case "precio":
			return direction.equalsIgnoreCase("asc") ? repository.findAllOrderByPrecioAsc()
					: repository.findAllOrderByPrecioDesc();
		default:
			return direction.equalsIgnoreCase("asc") ? repository.findAll(Sort.by(Sort.Direction.ASC, "id"))
					: repository.findAll(Sort.by(Sort.Direction.DESC, "id"));
		}
	}
}
