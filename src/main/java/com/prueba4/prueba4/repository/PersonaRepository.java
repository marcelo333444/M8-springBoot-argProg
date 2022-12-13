
package com.prueba4.prueba4.repository;

import com.prueba4.prueba4.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
