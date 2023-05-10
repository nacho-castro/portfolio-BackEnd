
package com.back.AuthApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Perfil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String profile;
    private String position;
    private String ubication;
    private String about;

    public Perfil() {
    }

    public Perfil(Long id, String name,String profile, String position, String ubication, String about) {
        this.id = id;
        this.name = name;
        this.profile = profile;
        this.position = position;
        this.ubication = ubication;
        this.about = about;
    }
    
    
}
