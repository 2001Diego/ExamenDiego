package com.empresa.service;

import com.empresa.entity.Artista;
import com.empresa.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.repository.ArtistaRepository;

@Service

public class ArtistaService implements IArtistaService{

    
    @Autowired
    private ArtistaRepository ArtistaRepository;
    
    @Override
    public List<Artista> listArtista() {
        return (List<Artista>)ArtistaRepository.findAll();
    }

    

}
