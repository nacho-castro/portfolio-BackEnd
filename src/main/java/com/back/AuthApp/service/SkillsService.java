/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.Skills;
import com.back.AuthApp.repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{

     @Autowired
    public SkillsRepository skillRepo;
    
    @Override
    public List<Skills> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void editarSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Optional<Skills> getById(long id) {
        return skillRepo.findById(id);
    }

    @Override
    public boolean existsById(long id) {
        return skillRepo.existsById(id);
    }
    
}
