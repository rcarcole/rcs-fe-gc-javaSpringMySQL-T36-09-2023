package com.ejercicios.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio1.dao.IFabricantesDAO;
import com.ejercicios.ejercicio1.dto.Fabricantes;

@Service
public class FabricantesServiceImpl implements IFabricantesService{

	@Autowired
	IFabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes mostrarFabricanteID(int id) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.findById((long) id).get();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		// TODO Auto-generated method stub
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int id) {
		// TODO Auto-generated method stub
		iFabricantesDAO.deleteById((long)id);
	}

}
