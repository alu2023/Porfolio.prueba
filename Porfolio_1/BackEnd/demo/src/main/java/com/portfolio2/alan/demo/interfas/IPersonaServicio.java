/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio2.alan.demo.interfas;

import com.portfolio2.alan.demo.entidad.Persona;
import java.util.List;

/**
 *
 * @author Alan
 */
public interface IPersonaServicio {
    
    public List<Persona> getPersona();
    
            //guardar obj de tipo persona
            public void savePersona(Persona persona);
            
             //buscar persona por id
              public Persona findPersona(Long id);  
            
              //eliminar persona
            public void deletePersona(Long id);  
}
