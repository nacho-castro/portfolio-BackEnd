
package com.back.AuthApp.repository;

import com.back.AuthApp.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Long>{
    
}
