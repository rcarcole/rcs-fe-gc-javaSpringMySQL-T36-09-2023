package com.ejercicios.ejercicio4.service;

import java.util.List;

import com.ejercicios.ejercicio4.dto.Peliculas;


public interface IPeliculasService {

	// Listar todas las pelicula
	public List<Peliculas> listarPeliculas();
	
	// Listar la pelicula mediante la id
	public Peliculas mostrarPeliculasID(int id);
		
	// Guardar una pelicula
	public Peliculas guardarPelicula(Peliculas pelicula);
	
	// Actualizar una pelicula
	public Peliculas actualizarPelicula(Peliculas pelicula);
	
	// Eliminar una pelicula mediante id
	public void eliminarPelicula(int id);
}
