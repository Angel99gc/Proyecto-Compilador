package com.example.ProyectoCompilador.Controlador;


import java.util.HashMap;
import  java.util.Map;

import com.example.ProyectoCompilador.Analisis.Analisis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controlador {
    @Autowired
    Analisis analisis;

    @GetMapping("/analisis/{code}")
    public Map<String, String> getAnalisis(@PathVariable String code){
        Map<String, String> json = new HashMap<>();
        json.put("hola","hola");
        //return this.analisis.getAnalisisSintactico(code);
        return json;
    }
}
