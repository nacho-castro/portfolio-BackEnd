
package com.back.AuthApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String image;
    private String description;
    private String link;

    public Proyectos() {
    }

    public Proyectos(Long id, String title, String image, String description, String link) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.link = link;
    }
    
    
}
