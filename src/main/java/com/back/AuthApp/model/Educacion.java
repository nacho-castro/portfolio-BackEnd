
package com.back.AuthApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String school;
    private String title;
    private String image;
    private int start;
    private int end;

    public Educacion() {
    }

    public Educacion(Long id, String school, String title, String image, int start, int end) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.image = image;
        this.start = start;
        this.end = end;
    }
    
    
}
