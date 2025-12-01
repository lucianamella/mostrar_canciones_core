package com.lucianamella.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity 
@Table(name="canciones")
public class Cancion {


    //Desde aquí comienza la core de AGREGAR CANCIONES
    //Anotaciones con validación de formulario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título es obligatorio")
    @Size(min = 5, message = "Al menos 5 caracteres de longitud.")
    private String titulo;

    @NotBlank(message = "El artista es obligatorio")
    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String artista;

    @NotBlank(message = "El álbum es obligatorio")
    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String album;

    @NotBlank(message = "El idioma es obligatorio")
    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String idioma; 

    @NotBlank(message = "El género es obligatorio")
    @Size(min = 3, message = "Al menos 3 caracteres de longitud.")
    private String genero;

    @CreationTimestamp
    @Column(name= "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    @Column(name= "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;


    public Cancion() {
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    
 
    
}
