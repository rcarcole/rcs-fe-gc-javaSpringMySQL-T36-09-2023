package com.ejercicios.ejercicio2.service;

import java.util.List;

import com.ejercicios.ejercicio2.dto.Empleados;

public interface IEmpleadosService {

	// Listar todos los empleados
	public List<Empleados> listarEmpleados();
	
	// Listar el empleado mediante la id
	public Empleados mostrarEmpleadosID(String id);
		
	// Guardar un empleado
	public Empleados guardarEmpleado(Empleados empleado);
	
	// Actualizar un empleado
	public Empleados actualizarEmpleado(Empleados empleado);
	
	// Eliminar un empleado mediante id
	public void eliminarEmpleado(String id);
}
