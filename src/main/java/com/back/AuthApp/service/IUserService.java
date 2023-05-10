/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.User;
import java.util.Optional;

public interface IUserService {
    public User verUser(Long id);
    public Optional<User> getById(long id);
}
