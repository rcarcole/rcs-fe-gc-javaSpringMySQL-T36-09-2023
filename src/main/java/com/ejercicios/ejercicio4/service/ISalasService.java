package com.ejercicios.ejercicio4.service;

import java.util.List;

import com.ejercicios.ejercicio4.dto.Salas;

public interface ISalasService {
	
	// Listar todas las salas
	public List<Salas> listarSalas();
	
	// Listar la sala mediante la id
	public Salas mostrarSalasID(int id);
		
	// Guardar una sala
	public Salas guardarSala(Salas salas);
	
	// Actualizar una sala
	public Salas actualizarSala(Salas salas);
	
	// Eliminar una sala mediante id
	public void eliminarSala(int id);
}
