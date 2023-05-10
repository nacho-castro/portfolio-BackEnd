
package com.back.AuthApp.controller;

import com.back.AuthApp.model.Educacion;
import com.back.AuthApp.service.IEduService;
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
public class EducacionController {
    
    @Autowired
    private IEduService eduServ;
    
    @GetMapping("/edu/ver")
    @ResponseBody
    public List<Educacion> verEdu() {
        return eduServ.verEdu();
    }
    
    @GetMapping("/edu/detail/{id}")
    @ResponseBody
    public Educacion getById(@PathVariable("id") long id){
        Educacion edu = eduServ.getById(id).get();
        return edu;
    }
    
    @PostMapping("/edu/crear")
    public void crearExp(@RequestBody Educacion edu) {
        eduServ.editarEdu(edu);
    }
    
    @PutMapping("/edu/editar/{id}")
    public void editarEdu(@PathVariable("id") long id, @RequestBody Educacion edu) {
       Educacion new_edu = eduServ.getById(id).get();
        new_edu.setSchool(edu.getSchool());
        new_edu.setTitle(edu.getTitle());
        new_edu.setImage(edu.getImage());
        new_edu.setStart(edu.getStart());
        new_edu.setEnd(edu.getEnd());
        eduServ.editarEdu(new_edu);
    }
    
    @DeleteMapping("/edu/borrar/{id}")
    public void borrarEdu(@PathVariable("id") long id){
        eduServ.borrarEdu(id);
    }
}
