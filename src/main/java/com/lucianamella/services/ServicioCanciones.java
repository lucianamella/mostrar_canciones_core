package com.lucianamella.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucianamella.models.Cancion;
import java.util.List;
import com.lucianamella.repositories.RepositorioCanciones;


@Service
public class ServicioCanciones {
    
    @Autowired
    private RepositorioCanciones repoCanciones;

    public List<Cancion> obtenerTodasLasCanciones() {
        return this.repoCanciones.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        return repoCanciones.findById(id).orElse(null);
    }

    //Desde aquí comienza la core de AGREGAR CANCIONES
    public Cancion agregarCancion(Cancion cancion) {
        return repoCanciones.save(cancion);
    }
}
