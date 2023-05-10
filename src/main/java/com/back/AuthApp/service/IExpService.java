
package com.back.AuthApp.service;

import com.back.AuthApp.model.Experiencia;
import java.util.List;
import java.util.Optional;

public interface IExpService {
    public List<Experiencia> verExp();
    public void editarExp(Experiencia exp);
    public void borrarExp(long id);
    public Optional<Experiencia> getById(long id);
    public boolean existsById(long id);
}
