
package com.prueba4.prueba4.service;

import com.prueba4.prueba4.model.Persona;
import java.util.List;


public interface PersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona (Long id);
}
