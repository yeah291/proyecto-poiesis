/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.poiesis.service;

import com.example.poiesis.DAO.solicitudDAO;
import com.example.poiesis.domain.solicitud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesus
 */
@Service
public class solicitudServiceImpl implements solicitudService{
    @Autowired
    private solicitudDAO dao;

    @Override
    public List<solicitud> listarSolicitudes() {
        return (List<solicitud>) dao.findAll();
    }

    @Override
    public void guardar(solicitud s) {
        dao.save(s);
    }

    @Override
    public void eliminar(solicitud s) {
        dao.delete(s);
    }

    @Override
    public solicitud encontrarAlumno(solicitud s) {
        return dao.findById(s.getId_soli()).orElse(null);
    }
    
    
}
