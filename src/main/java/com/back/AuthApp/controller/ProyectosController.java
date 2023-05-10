
package com.back.AuthApp.controller;

import com.back.AuthApp.model.Proyectos;
import com.back.AuthApp.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
    @Autowired
    private IProyectosService proyServ;
    
    @GetMapping("/proyectos/ver")
    @ResponseBody
    public List<Proyectos> verProyecto() {
        return proyServ.verProyecto();
    }
    
    @GetMapping("/proyectos/detail/{id}")
    @ResponseBody
    public Proyectos getById(@PathVariable("id") long id){
        Proyectos proy = proyServ.getById(id).get();
        return proy;
    }

    @PostMapping("/proyectos/crear")
    public void crearExp(@RequestBody Proyectos proy) {
        proyServ.editarProyecto(proy);
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public void editarProyecto(@PathVariable("id") long id, @RequestBody Proyectos proyecto) {
        Proyectos new_proy = proyServ.getById(id).get();
        new_proy.setDescription(proyecto.getDescription());
        new_proy.setTitle(proyecto.getTitle());
        new_proy.setImage(proyecto.getImage());
        new_proy.setLink(proyecto.getLink());
        proyServ.editarProyecto(new_proy);
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public void borrarProyecto(@PathVariable("id") long id){
        proyServ.borrarProyecto(id);
    }
}
