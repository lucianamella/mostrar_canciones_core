<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Detalle cancion</title>
        </head>

        <body>
            <h1>Detalle Cancion</h1>
            <p><strong>Título:</strong> ${cancion.titulo}</p>
            <p><strong>Artista:</strong> ${cancion.artista}</p>
            <p><strong>Álbum:</strong> ${cancion.album}</p>
            <p><strong>Idioma:</strong> ${cancion.idioma}</p>
            <p><strong>Género:</strong> ${cancion.genero}</p>
            <a href="/canciones">Volver a la lista de canciones</a>
            <br/>
            <a href="/canciones/formulario/editar/${cancion.id}">Editar canción</a>
        </body>
                
        </html>