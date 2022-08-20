/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio2.alan.demo.repositorio;

import com.portfolio2.alan.demo.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alan
 */
@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Long> {
    
}
