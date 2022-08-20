/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio2.alan.demo.servicio;

import com.portfolio2.alan.demo.entidad.Persona;
import com.portfolio2.alan.demo.interfas.IPersonaServicio;
import com.portfolio2.alan.demo.repositorio.IPersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alan
 */
@Service
public class ImplementacionPersonaSericio implements IPersonaServicio{
    @Autowired IPersonaRepo ipersonaRepository;
            
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public Persona findPersona(Long id) {
      Persona persona = ipersonaRepository.findById(id) .orElse(null);
      return persona;
    }

    @Override
    public void deletePersona(Long id) {
       ipersonaRepository.deleteById(id);
    }
    
}
