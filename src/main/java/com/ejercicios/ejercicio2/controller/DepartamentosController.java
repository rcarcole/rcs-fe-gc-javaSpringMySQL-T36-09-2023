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

import com.ejercicios.ejercicio2.dto.Departamentos;
import com.ejercicios.ejercicio2.service.DepartamentosServiceImpl;


@RestController
@RequestMapping("/api")
public class DepartamentosController {
	
	@Autowired
	DepartamentosServiceImpl departamentosServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamentos> listarDepartamentos(){
		return departamentosServiceImpl.listarDepartamentos();
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamentos mostrarDepartamentosID(@PathVariable(name="codigo") int codigo) {
		return departamentosServiceImpl.mostrarDepartamentosID(codigo);
	}
	
	@PostMapping("/departamentos")
	public Departamentos guardarDepartamento(@RequestBody Departamentos departamentos) {
		return departamentosServiceImpl.guardarDepartamento(departamentos);
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamentos actualizarDepartamento(@PathVariable(name="codigo") int codigo, @RequestBody Departamentos departamentos) {
		
		Departamentos departamento_seleccionado = new Departamentos();
		Departamentos departamento_actualizado = new Departamentos();
		
		departamento_seleccionado = departamentosServiceImpl.mostrarDepartamentosID(codigo);
		departamento_seleccionado.setNombre(departamentos.getNombre());
		departamento_seleccionado.setPresupuesto(departamentos.getPresupuesto());
		
		departamento_actualizado = departamentosServiceImpl.actualizarDepartamento(departamento_seleccionado);
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name="codigo") int codigo) {
		departamentosServiceImpl.eliminarDepartamento(codigo);
	}
}
