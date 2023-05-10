/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.Educacion;
import java.util.List;
import java.util.Optional;

public interface IEduService {
    public List<Educacion> verEdu();
    public void editarEdu(Educacion edu);
    public void borrarEdu(long id);
    public Optional<Educacion> getById(long id);
    public boolean existsById(long id);
}
