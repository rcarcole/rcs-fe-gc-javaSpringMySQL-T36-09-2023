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

import com.ejercicios.ejercicio1.dto.Articulos;
import com.ejercicios.ejercicio1.service.ArticulosServiceImpl;


@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listaFabricantes(){
		return articulosServiceImpl.listarArticulos();
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulos mostrarFabricantesID(@PathVariable(name="codigo") int codigo) {
		return articulosServiceImpl.mostrarArticulosID(codigo);
	}
	
	@PostMapping("/articulos")
	public Articulos guardarFabricantes(@RequestBody Articulos articulos) {
		return articulosServiceImpl.guardarArticulo(articulos);
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulos actualizarFabricantes(@PathVariable(name="codigo") int codigo, @RequestBody Articulos articulos) {
		
		Articulos articulo_seleccionado   = new Articulos();
		Articulos articulo_actualizado = new Articulos();
		
		articulo_seleccionado = articulosServiceImpl.mostrarArticulosID(codigo);
		articulo_actualizado.setNombre(articulos.getNombre());
		articulo_actualizado.setPrecio(articulos.getPrecio());
		
		articulo_actualizado = articulosServiceImpl.actualizarArticulo(articulo_seleccionado);
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo") int codigo) {
		articulosServiceImpl.eliminarArticulo(codigo);
	}
}
