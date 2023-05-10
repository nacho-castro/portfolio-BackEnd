/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.Educacion;
import com.back.AuthApp.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduService implements IEduService{

    @Autowired
    public EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> verEdu() {
         return eduRepo.findAll();
    }

    @Override
    public void editarEdu(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEdu(long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Optional<Educacion> getById(long id) {
        return eduRepo.findById(id);
    }

    @Override
    public boolean existsById(long id) {
        return eduRepo.existsById(id);
    }
      
}
