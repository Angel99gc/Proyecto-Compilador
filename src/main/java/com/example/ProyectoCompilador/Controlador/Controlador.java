package com.example.ProyectoCompilador.Controlador;

import java.util.HashMap;
import java.util.Map;

import com.example.ProyectoCompilador.Analisis.Analisis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/controlador")
public class Controlador{
    @Autowired
    Analisis analisis;

    @GetMapping("/prueba")
    public String prueba(){
        return "nice";
    }
    @PostMapping(name = "/analisis", consumes = MediaType.TEXT_PLAIN_VALUE)
    public Map<String, String> postAnalisis(@RequestBody() String code){
        return this.analisis.getAnalisisSintactico(code);
    }
}