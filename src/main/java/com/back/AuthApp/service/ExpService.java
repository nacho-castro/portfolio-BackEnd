/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.Experiencia;
import com.back.AuthApp.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpService implements IExpService{
    
    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> verExp() {
        return expRepo.findAll();
    }

    @Override
    public void editarExp(Experiencia exp) {
       expRepo.save(exp);
    }

    @Override
    public void borrarExp(long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Optional<Experiencia> getById(long id) {
        return expRepo.findById(id);
    }

    @Override
    public boolean existsById(long id) {
        return expRepo.existsById(id);
    }
}
