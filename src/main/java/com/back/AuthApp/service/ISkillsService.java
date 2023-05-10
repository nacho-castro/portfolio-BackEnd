
package com.back.AuthApp.service;

import com.back.AuthApp.model.Skills;
import java.util.List;
import java.util.Optional;

public interface ISkillsService {
    public List<Skills> verSkill();
    public void editarSkill(Skills skill);
    public void borrarSkill(long id);
    public Optional<Skills> getById(long id);
    public boolean existsById(long id);
}
