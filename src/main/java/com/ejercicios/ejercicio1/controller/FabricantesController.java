package com.ejercicios.ejercicio1.controller;

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

import com.ejercicios.ejercicio1.dto.Fabricantes;
import com.ejercicios.ejercicio1.service.FabricantesServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listaFabricantes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricantes mostrarFabricantesID(@PathVariable(name="codigo") int codigo) {
		return fabricantesServiceImpl.mostrarFabricanteID(codigo);
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes guardarFabricantes(@RequestBody Fabricantes fabricante) {
		return fabricantesServiceImpl.guardarFabricante(fabricante);
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricantes actualizarFabricantes(@PathVariable(name="codigo") int codigo, @RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado = new Fabricantes();
		Fabricantes fabricante_actualizado = new Fabricantes();
		
		fabricante_seleccionado = fabricantesServiceImpl.mostrarFabricanteID(codigo);
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricantesServiceImpl.actualizarFabricante(fabricante_seleccionado);
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo") int codigo) {
		fabricantesServiceImpl.eliminarFabricante(codigo);
	}
}
