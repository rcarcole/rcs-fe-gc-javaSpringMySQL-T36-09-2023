package com.ejercicios.ejercicio1.service;

import java.util.List;

import com.ejercicios.ejercicio1.dto.Articulos;


public interface IArticulosService {

	// Listar todos los trabajadores
	public List<Articulos> listarArticulos();
	
	// Listar el trabajador mediante la id
	public Articulos mostrarArticulosID(int id);
		
	// Guardar un trabajador
	public Articulos guardarArticulo(Articulos articulo);
	
	// Actualizar un trabajador
	public Articulos actualizarArticulo(Articulos articulo);
	
	// Eliminar un trabajador mediante id
	public void eliminarArticulo(int id);
}
