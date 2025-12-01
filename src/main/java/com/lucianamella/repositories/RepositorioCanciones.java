package com.lucianamella.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.lucianamella.models.Cancion;
import java.util.List;

@Repository
public interface RepositorioCanciones  extends CrudRepository <Cancion, Long> {
    List<Cancion> findAll(); 
}
