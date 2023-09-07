package com.ejercicios.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicios.ejercicio4.dto.Peliculas;
import com.ejercicios.ejercicio4.service.PeliculasServiceImpl;


@RestController
@RequestMapping("/api")
public class PeliculasController {
	
	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Peliculas mostrarPeliculasID(@PathVariable(name="codigo") int codigo) {
		return peliculasServiceImpl.mostrarPeliculasID(codigo);
	}
	
	@PostMapping("/peliculas")
	public Peliculas guardarPelicula(@RequestBody Peliculas peliculas) {
		return peliculasServiceImpl.guardarPelicula(peliculas);
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Peliculas actualizarPelicula(@PathVariable(name="codigo") int codigo, @RequestBody Peliculas peliculas) {
		
		Peliculas pelicula_seleccionado = new Peliculas();
		Peliculas pelicula_actualizado = new Peliculas();
		
		pelicula_seleccionado = peliculasServiceImpl.mostrarPeliculasID(codigo);
		pelicula_seleccionado.setNombre(peliculas.getNombre());
		pelicula_seleccionado.setCalificacionEdad(peliculas.getCalificacionEdad());
		
		pelicula_actualizado = peliculasServiceImpl.actualizarPelicula(pelicula_seleccionado);
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo") int codigo) {
		peliculasServiceImpl.eliminarPelicula(codigo);
	}

}
