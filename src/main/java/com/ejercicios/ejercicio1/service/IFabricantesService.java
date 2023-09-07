package com.ejercicios.ejercicio1.service;

import java.util.List;

import com.ejercicios.ejercicio1.dto.Fabricantes;


public interface IFabricantesService {

	// Listar todos los trabajadores
	public List<Fabricantes> listarFabricantes();
	
	// Listar el trabajador mediante la id
	public Fabricantes mostrarFabricanteID(int id);
		
	// Guardar un trabajador
	public Fabricantes guardarFabricante(Fabricantes fabricante);
	
	// Actualizar un trabajador
	public Fabricantes actualizarFabricante(Fabricantes fabricante);
	
	// Eliminar un trabajador mediante id
	public void eliminarFabricante(int id);

}
