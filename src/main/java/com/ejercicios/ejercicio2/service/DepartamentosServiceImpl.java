package com.ejercicios.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio2.dao.IDepartamentosDAO;
import com.ejercicios.ejercicio2.dto.Departamentos;

@Service
public class DepartamentosServiceImpl implements IDepartamentosService{

	@Autowired
	IDepartamentosDAO iDepartamentosDAO;
	
	@Override
	public List<Departamentos> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamentos mostrarDepartamentosID(int id) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamentos guardarDepartamento(Departamentos departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public Departamentos actualizarDepartamento(Departamentos departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int id) {
		// TODO Auto-generated method stub
		iDepartamentosDAO.deleteById(id);
	}

}
