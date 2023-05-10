package com.back.AuthApp.controller;

import com.back.AuthApp.model.Experiencia;
import com.back.AuthApp.service.IExpService;
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
public class ExperienciaController {

    @Autowired
    private IExpService expServ;

    @GetMapping("/exp/ver")
    @ResponseBody
    public List<Experiencia> verExp() {
        return expServ.verExp();
    }
    
    @GetMapping("/exp/detail/{id}")
    @ResponseBody
    public Experiencia getById(@PathVariable("id") long id){
        Experiencia exp = expServ.getById(id).get();
        return exp;
    }

    @PostMapping("/exp/crear")
    public void crearExp(@RequestBody Experiencia exp) {
        expServ.editarExp(exp);
    }

    @PutMapping("/exp/editar/{id}")
    public void editarExp(@PathVariable("id") long id, @RequestBody Experiencia exp) {
        Experiencia new_exp = expServ.getById(id).get();
        new_exp.setDescription(exp.getDescription());
        new_exp.setTitle(exp.getTitle());
        new_exp.setImage(exp.getImage());
        expServ.editarExp(new_exp);
    }

    @DeleteMapping("/exp/borrar/{id}")
    public void borrarExp(@PathVariable("id") long id) {
        expServ.borrarExp(id);
    }
}
