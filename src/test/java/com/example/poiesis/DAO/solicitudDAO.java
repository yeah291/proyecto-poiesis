/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.poiesis.DAO;

import com.example.poiesis.domain.solicitud;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jesus
 */
public interface solicitudDAO extends CrudRepository<solicitud, Long>{
    
}
