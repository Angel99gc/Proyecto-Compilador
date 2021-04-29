package com.team.Proyecto.Compilador;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, methods= {RequestMethod.POST}, allowCredentials = "true")
@RestController
@RequestMapping(value = {"/controlador"}, consumes = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
public class Controlador {
    @Autowired
    Analisis analisis;

    @PostMapping(path = {"/{code}"})
    public String analisis(@PathVariable("code") String code, @RequestBody String body){
        try{
            System.out.println("entro");
            System.out.println(code);
            System.out.println(body);

            String prueba = this.analisis.prueba();
            return prueba;
        }catch (Error error){
            return "error";
        }
    }
}
