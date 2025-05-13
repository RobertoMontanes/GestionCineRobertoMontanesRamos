package com.salesianostriana.dam.service;

import com.salesianostriana.dam.model.Entrada;
import com.salesianostriana.dam.repository.EntradaRepository;
import org.springframework.stereotype.Service;

@Service
public class EntradaService extends BaseService<Entrada, Long, EntradaRepository> {

    public EntradaService(EntradaRepository repo) {
        super(repo);
    }
}