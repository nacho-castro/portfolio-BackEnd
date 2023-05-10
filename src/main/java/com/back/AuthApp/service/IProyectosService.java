
package com.back.AuthApp.service;

import com.back.AuthApp.model.Proyectos;
import java.util.List;
import java.util.Optional;


public interface IProyectosService {
    public List<Proyectos> verProyecto();
    public void editarProyecto(Proyectos proyecto);
    public void borrarProyecto(long id);
    public Optional<Proyectos> getById(long id);
    public boolean existsById(long id);
}
