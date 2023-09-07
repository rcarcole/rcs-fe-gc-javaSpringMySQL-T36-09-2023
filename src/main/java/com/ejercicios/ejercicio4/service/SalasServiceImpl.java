package com.ejercicios.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio4.dao.ISalasDAO;
import com.ejercicios.ejercicio4.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Salas> listarSalas() {
		// TODO Auto-generated method stub
		return iSalasDAO.findAll();
	}

	@Override
	public Salas mostrarSalasID(int id) {
		// TODO Auto-generated method stub
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Salas guardarSala(Salas salas) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(salas);
	}

	@Override
	public Salas actualizarSala(Salas salas) {
		// TODO Auto-generated method stub
		return iSalasDAO.save(salas);
	}

	@Override
	public void eliminarSala(int id) {
		// TODO Auto-generated method stub
		iSalasDAO.deleteById(id);
	}

}
