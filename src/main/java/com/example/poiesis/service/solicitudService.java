/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.poiesis.service;

import com.example.poiesis.domain.solicitud;
import java.util.List;

/**
 *
 * @author jesus
 */
public interface solicitudService {
    public List<solicitud> listarSolicitudes();
    public void guardar(solicitud s);
    public void eliminar(solicitud s);
    public solicitud encontrarAlumno(solicitud s);
}
