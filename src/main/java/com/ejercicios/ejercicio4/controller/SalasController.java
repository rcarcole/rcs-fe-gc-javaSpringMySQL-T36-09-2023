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

import com.ejercicios.ejercicio4.dto.Salas;
import com.ejercicios.ejercicio4.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {
	
	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return salasServiceImpl.listarSalas();
	}
	
	@GetMapping("/salas/{codigo}")
	public Salas mostrarSalasID(@PathVariable(name="codigo") int codigo) {
		return salasServiceImpl.mostrarSalasID(codigo);
	}
	
	@PostMapping("/salas")
	public Salas guardarSala(@RequestBody Salas salas) {
		return salasServiceImpl.guardarSala(salas);
	}
	
	@PutMapping("/salas/{codigo}")
	public Salas actualizarSala(@PathVariable(name="codigo") int codigo, @RequestBody Salas salas) {
		
		Salas sala_seleccionado = new Salas();
		Salas sala_actualizado = new Salas();
		
		sala_seleccionado = salasServiceImpl.mostrarSalasID(codigo);
		sala_seleccionado.setNombre(salas.getNombre());
		sala_seleccionado.setPeliculas(salas.getPeliculas());
		
		sala_actualizado = salasServiceImpl.actualizarSala(sala_seleccionado);
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name="codigo") int codigo) {
		salasServiceImpl.eliminarSala(codigo);
	}
}
