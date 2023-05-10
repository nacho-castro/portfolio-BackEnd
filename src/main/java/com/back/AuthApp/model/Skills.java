
package com.back.AuthApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String per;

    public Skills() {
    }

    public Skills(Long id, String title, String per) {
        this.id = id;
        this.title = title;
        this.per = per;
    }
    
    
}
