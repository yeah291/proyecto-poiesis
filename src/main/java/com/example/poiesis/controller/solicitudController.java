/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.poiesis.controller;

import com.example.poiesis.service.solicitudService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jesus
 */
@Controller
@Slf4j
public class solicitudController {
    
    @Autowired
    private solicitudService service;
    
    
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    
    @GetMapping("/contactanos")
    public String contacto(){
        return "contactenos";
    }
    
     @GetMapping("/productos")
    public String productos(){
        return "productos";
    }
    
    @GetMapping("/listado")
    public String listado(Model model){
        var solicitud = service.listarSolicitudes();
        model.addAttribute("solicitud",solicitud);
        log.info("Ejecutando el controlador spring MVC");
        
        return "listarSolicitudes";
    }
}
