package com.salesianostriana.dam.service;

import com.salesianostriana.dam.model.Sala;
import com.salesianostriana.dam.repository.SalaRepository;
import org.springframework.stereotype.Service;

@Service
public class SalaService extends BaseService<Sala, Long, SalaRepository> {

    public SalaService(SalaRepository repo) {
        super(repo);
    }
}