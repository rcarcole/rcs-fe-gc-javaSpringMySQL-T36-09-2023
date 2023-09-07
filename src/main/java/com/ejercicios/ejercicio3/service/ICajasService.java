package com.ejercicios.ejercicio3.service;

import java.util.List;

import com.ejercicios.ejercicio3.dto.Cajas;

public interface ICajasService {

	// Listar todas las cajas
	public List<Cajas> listarCajas();
	
	// Listar la caja mediante la id
	public Cajas mostrarCajasID(String referencia);
		
	// Guardar una caja
	public Cajas guardarCaja(Cajas caja);
	
	// Actualizar una caja
	public Cajas actualizarCaja(Cajas caja);
	
	// Eliminar una caja mediante id
	public void eliminarCaja(String referencia);
}
