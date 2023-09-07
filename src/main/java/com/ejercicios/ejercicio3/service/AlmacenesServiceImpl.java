package com.ejercicios.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio3.dao.IAlmacenesDAO;
import com.ejercicios.ejercicio3.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService{

	@Autowired
	IAlmacenesDAO iAlmacenesDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findAll();
	}

	@Override
	public Almacenes mostrarAlmacenesID(int id) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.findById(id).get();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		// TODO Auto-generated method stub
		return iAlmacenesDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int id) {
		// TODO Auto-generated method stub
		iAlmacenesDAO.deleteById(id);
	}

}
