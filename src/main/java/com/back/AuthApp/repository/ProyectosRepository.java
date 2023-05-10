
package com.back.AuthApp.repository;

import com.back.AuthApp.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos,Long>{
    
}
