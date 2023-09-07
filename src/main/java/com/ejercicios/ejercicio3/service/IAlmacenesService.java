package com.ejercicios.ejercicio3.service;

import java.util.List;

import com.ejercicios.ejercicio3.dto.Almacenes;

public interface IAlmacenesService {

	// Listar todos los almacenes
	public List<Almacenes> listarAlmacenes();
	
	// Listar el almacen mediante la id
	public Almacenes mostrarAlmacenesID(int id);
		
	// Guardar un almacen
	public Almacenes guardarAlmacen(Almacenes almacen);
	
	// Actualizar un empleado
	public Almacenes actualizarAlmacen(Almacenes almacen);
	
	// Eliminar un almacen mediante id
	public void eliminarAlmacen(int id);
}
