package com.verduleria.service;

import com.verduleria.entity.Verdura;
import com.verduleria.repository.VerduraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerduraService implements IVerduraService{
    
    @Autowired
    private VerduraRepository verduraRepository;

    @Override
    public List<Verdura> getAllVerdura() {
        return (List<Verdura>)verduraRepository.findAll();
    }

    @Override
    public Verdura getVerduraById(long id) {
        return verduraRepository.findById(id).orElse(null);
    }

    @Override
    public void saveVerdura(Verdura verdura) {
        verduraRepository.save(verdura);    }

    @Override
    public void delete(long id) {
        verduraRepository.deleteById(id);
    }
    
}
