package com.lucianamella.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

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
    
    //Desde aquí comienza la core de AGREGAR CANCIONES
    
    @GetMapping("/canciones/formulario/agregar") //Ruta para mostrar el formulario de agregar cancion
    public String formularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new com.lucianamella.models.Cancion());
        return "agregarCancion"; // Este formulario cuenta con todos los campos/atributos de una canción.
    }

    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") com.lucianamella.models.Cancion cancion, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "agregarCancion";
        }
        servicioCanciones.agregarCancion(cancion);
        return "redirect:/canciones";
    }
    
}
