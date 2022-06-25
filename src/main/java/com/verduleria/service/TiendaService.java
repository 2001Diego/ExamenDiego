package com.verduleria.service;

import com.verduleria.entity.Tienda;
import com.verduleria.repository.TiendaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TiendaService implements ITiendaService{

    
    @Autowired
    private TiendaRepository tiendaRepository;
    
    @Override
    public List<Tienda> listStore() {
        return (List<Tienda>)tiendaRepository.findAll();
    }

}
