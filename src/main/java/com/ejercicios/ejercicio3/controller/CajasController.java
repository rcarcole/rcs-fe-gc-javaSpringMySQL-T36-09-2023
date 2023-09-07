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

import com.ejercicios.ejercicio3.dto.Cajas;
import com.ejercicios.ejercicio3.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {
	
	@Autowired
	CajasServiceImpl cajasServiceImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajasServiceImpl.listarCajas();
	}
	
	@GetMapping("/cajas/{codigo}")
	public Cajas mostrarCajasID(@PathVariable(name="codigo") String referencia) {
		return cajasServiceImpl.mostrarCajasID(referencia);
	}
	
	@PostMapping("/cajas")
	public Cajas guardarCaja(@RequestBody Cajas departamentos) {
		return cajasServiceImpl.guardarCaja(departamentos);
	}
	
	@PutMapping("/cajas/{codigo}")
	public Cajas actualizarCaja(@PathVariable(name="codigo") String referencia, @RequestBody Cajas cajas) {
		
		Cajas caja_seleccionado = new Cajas();
		Cajas caja_actualizado = new Cajas();
		
		caja_seleccionado = cajasServiceImpl.mostrarCajasID(referencia);
		caja_seleccionado.setContenido(cajas.getContenido());
		caja_seleccionado.setValor(cajas.getValor());
		caja_seleccionado.setAlmacenes(cajas.getAlmacenes());
		
		caja_actualizado = cajasServiceImpl.actualizarCaja(caja_seleccionado);
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{codigo}")
	public void eliminarCaja(@PathVariable(name="codigo") String referencia) {
		cajasServiceImpl.eliminarCaja(referencia);
	}
}
