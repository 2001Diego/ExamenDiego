package com.empresa.service;

import com.empresa.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.repository.ConciertoRepository;

@Service
public class ConciertoService implements IConciertoService{
    
    @Autowired
    private ConciertoRepository ConciertoRepository;

    @Override
    public List<Concierto> getAllConcierto() {
        return (List<Concierto>)ConciertoRepository.findAll();
    }

    @Override
    public Concierto getConciertoById(long id) {
        return ConciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcierto(Concierto verdura) {
        ConciertoRepository.save(verdura);    }

    @Override
    public void delete(long id) {
        ConciertoRepository.deleteById(id);
    }
    
}
