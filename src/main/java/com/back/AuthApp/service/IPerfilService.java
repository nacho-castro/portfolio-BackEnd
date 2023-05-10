/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.Perfil;
import java.util.Optional;

public interface IPerfilService {
    public Perfil verPerfil(Long id);
    public void editarPerfil(Perfil perfil);
    public Optional<Perfil> getById(long id);
}
