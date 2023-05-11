
package com.back.AuthApp.controller;

import com.back.AuthApp.model.Skills;
import com.back.AuthApp.service.ISkillsService;
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
@CrossOrigin(origins = "https://portfolio-frontend-ignacio.web.app")
public class SkillsController {
    @Autowired
    private ISkillsService skillServ;
    
    @GetMapping("/skills/ver")
    @ResponseBody
    public List<Skills> verSkill() {
        return skillServ.verSkill();
    }
    
    @GetMapping("/skills/detail/{id}")
    @ResponseBody
    public Skills getById(@PathVariable("id") long id){
        Skills skill = skillServ.getById(id).get();
        return skill;
    }
    
    @PostMapping("/skills/crear")
    public void crearExp(@RequestBody Skills skill) {
        skillServ.editarSkill(skill);
    }
    
    @PutMapping("/skills/editar/{id}")
    public void editarExp(@PathVariable("id") long id, @RequestBody Skills skill) {
        Skills new_skill = skillServ.getById(id).get();
        new_skill.setTitle(skill.getTitle());
        new_skill.setPer(skill.getPer());
        skillServ.editarSkill(new_skill);
    }

    @DeleteMapping("/skills/borrar/{id}")
    public void borrarSkill(@PathVariable("id") long id){
        skillServ.borrarSkill(id);
    }
}
