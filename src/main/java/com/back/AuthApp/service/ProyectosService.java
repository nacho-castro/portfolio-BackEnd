package com.back.AuthApp.service;

import com.back.AuthApp.model.Proyectos;
import com.back.AuthApp.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proyectoRepo;

    @Override
    public List<Proyectos> verProyecto() {
        return proyectoRepo.findAll();
    }

    @Override
    public void editarProyecto(Proyectos proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Optional<Proyectos> getById(long id) {
         return proyectoRepo.findById(id);
    }

    @Override
    public boolean existsById(long id) {
         return proyectoRepo.existsById(id);
    }

}
