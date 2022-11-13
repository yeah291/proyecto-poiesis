/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.poiesis.controller;

import com.example.poiesis.domain.solicitud;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jesus
 */
@Controller
public class solicitudController {
    
    @GetMapping("/contactenos")
    public String agregar(solicitud s){
        return "contactenos.html";
    }
    
}
