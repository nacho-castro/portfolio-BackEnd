
package com.back.AuthApp.service;

import com.back.AuthApp.model.Perfil;
import com.back.AuthApp.repository.PerfilRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService{

    @Autowired
    public PerfilRepository perfilRepo;
    
    @Override
    public Perfil verPerfil(Long id) {
        return perfilRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPerfil(Perfil perfil) {
       perfilRepo.save(perfil);
    }

    @Override
    public Optional<Perfil> getById(long id) {
        return perfilRepo.findById(id);
    }
    
}
