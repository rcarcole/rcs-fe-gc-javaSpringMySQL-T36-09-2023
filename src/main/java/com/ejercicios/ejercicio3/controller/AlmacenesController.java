package com.ejercicios.ejercicio3.controller;

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

import com.ejercicios.ejercicio3.dto.Almacenes;
import com.ejercicios.ejercicio3.service.AlmacenesServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenesServiceImpl almacenesServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenesServiceImpl.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacenes mostrarAlmacenesID(@PathVariable(name="codigo") int codigo) {
		return almacenesServiceImpl.mostrarAlmacenesID(codigo);
	}
	
	@PostMapping("/almacenes")
	public Almacenes guardarAlmacen(@RequestBody Almacenes almacenes) {
		return almacenesServiceImpl.guardarAlmacen(almacenes);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacenes actualizarAlmacen(@PathVariable(name="codigo") int codigo, @RequestBody Almacenes almacenes) {
		
		Almacenes almacen_seleccionado = new Almacenes();
		Almacenes almacen_actualizado = new Almacenes();
		
		almacen_seleccionado = almacenesServiceImpl.mostrarAlmacenesID(codigo);
		almacen_seleccionado.setLugar(almacenes.getLugar());
		almacen_seleccionado.setCapacidad(almacenes.getCapacidad());
		
		almacen_actualizado = almacenesServiceImpl.actualizarAlmacen(almacen_seleccionado);
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name="codigo") int codigo) {
		almacenesServiceImpl.eliminarAlmacen(codigo);
	}
}
