
package com.back.AuthApp.controller;

import com.back.AuthApp.model.Perfil;
import com.back.AuthApp.service.IPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin(origins = "https://portfolio-frontend-ignacio.web.app")
public class PerfilController {
    
    @Autowired
    private IPerfilService perfilServ;
 
    @GetMapping("/perfil/ver")
    @ResponseBody
    public Perfil verPerfil() {
        return perfilServ.verPerfil((long)1);
    }
    
    @PostMapping("/perfil/crear")
    public void crearPerfil(@RequestBody Perfil perfil) {
        perfilServ.editarPerfil(perfil);
    }
    
    @GetMapping("/perfil/detail/{id}")
    @ResponseBody
    public Perfil getById(@PathVariable("id") long id){
        Perfil perfil = perfilServ.getById(id).get();
        return perfil;
    }
    
    @PutMapping("/perfil/editar/{id}")
    public void editarExp(@PathVariable("id") long id, @RequestBody Perfil perfil) {
        Perfil new_perfil = perfilServ.getById(id).get();
        new_perfil.setName(perfil.getName());
        new_perfil.setProfile(perfil.getProfile());
        new_perfil.setPosition(perfil.getPosition());
        new_perfil.setAbout(perfil.getAbout());
         new_perfil.setUbication(perfil.getUbication());
        perfilServ.editarPerfil(new_perfil);
    }
}
