package com.lucianamella.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lucianamella.services.ServicioCanciones;

@Controller
public class ControladorCanciones {
    
    @Autowired
    private ServicioCanciones servicioCanciones;

    @GetMapping("/canciones") //Ruta para mostrar las canciones
    public String mostrarCanciones(Model model) {
        model.addAttribute("listaCanciones", servicioCanciones.obtenerTodasLasCanciones());
        return "canciones"; 
    }

    @GetMapping("/canciones/detalle/{id}") //Ruta para mostrar el detalle de una cancion
    public String desplegarDetalleCancion(@PathVariable("id") Long id, Model model) {
        model.addAttribute("cancion", servicioCanciones.obtenerCancionPorId(id));
        return "detalleCancion"; 
    }
    
}
