/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.AuthApp.service;

import com.back.AuthApp.model.User;
import com.back.AuthApp.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public User verUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public Optional<User> getById(long id) {
         return userRepo.findById(id);
    }
    
}
