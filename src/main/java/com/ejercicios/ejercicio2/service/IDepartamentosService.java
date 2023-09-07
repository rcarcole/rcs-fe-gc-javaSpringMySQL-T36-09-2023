package com.ejercicios.ejercicio2.service;

import java.util.List;

import com.ejercicios.ejercicio2.dto.Departamentos;

public interface IDepartamentosService {

	// Listar todos los departamentos
	public List<Departamentos> listarDepartamentos();
	
	// Listar el departamento mediante la id
	public Departamentos mostrarDepartamentosID(int id);
		
	// Guardar un departamento
	public Departamentos guardarDepartamento(Departamentos departamento);
	
	// Actualizar un departamento
	public Departamentos actualizarDepartamento(Departamentos departamento);
	
	// Eliminar un departamento mediante id
	public void eliminarDepartamento(int id);
}
