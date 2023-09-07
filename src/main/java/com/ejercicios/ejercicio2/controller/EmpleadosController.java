package com.ejercicios.ejercicio2.controller;

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

import com.ejercicios.ejercicio2.dto.Empleados;
import com.ejercicios.ejercicio2.service.EmpleadosServiceImpl;


@RestController
@RequestMapping("/api")
public class EmpleadosController {
	
	@Autowired
	EmpleadosServiceImpl empleadosServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleados> listarEmpleados(){
		return empleadosServiceImpl.listarEmpleados();
	}
	
	@GetMapping("/empleados/{codigo}")
	public Empleados mostrarEmpleadosID(@PathVariable(name="codigo") String codigo) {
		return empleadosServiceImpl.mostrarEmpleadosID(codigo);
	}
	
	@PostMapping("/empleados")
	public Empleados guardarEmpleado(@RequestBody Empleados empleados) {
		return empleadosServiceImpl.guardarEmpleado(empleados);
	}
	
	@PutMapping("/empleados/{codigo}")
	public Empleados actualizarEmpleado(@PathVariable(name="codigo") String codigo, @RequestBody Empleados empleados) {
		
		Empleados empleado_seleccionado = new Empleados();
		Empleados empleado_actualizado = new Empleados();
		
		empleado_seleccionado = empleadosServiceImpl.mostrarEmpleadosID(codigo);
		empleado_seleccionado.setNombre(empleados.getNombre());
		empleado_seleccionado.setApellidos(empleados.getApellidos());
		empleado_seleccionado.setDepartamentos(empleados.getDepartamentos());
		
		empleado_actualizado = empleadosServiceImpl.actualizarEmpleado(empleado_seleccionado);
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{codigo}")
	public void eliminarEmpleado(@PathVariable(name="codigo") String codigo) {
		empleadosServiceImpl.eliminarEmpleado(codigo);
	}
}
