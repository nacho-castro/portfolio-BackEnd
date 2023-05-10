/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.AuthApp.controller;

import com.back.AuthApp.model.User;
import com.back.AuthApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userServ;

    @PostMapping("/user/login")
    public ResponseEntity<User> loginUser(@RequestBody User userData) {
        User user = userServ.getById(1).get();
        if (user.getUsername().equals(userData.getUsername())) {
            if (user.getPassword().equals(userData.getPassword())) {
                return ResponseEntity.ok(user);
            }

        }

        return (ResponseEntity<User>) ResponseEntity.internalServerError();
    }
}
