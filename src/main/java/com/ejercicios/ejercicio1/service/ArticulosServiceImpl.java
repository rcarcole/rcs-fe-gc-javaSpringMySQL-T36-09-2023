package com.ejercicios.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio1.dao.IArticulosDAO;
import com.ejercicios.ejercicio1.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService{

	@Autowired
	IArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos() {
		// TODO Auto-generated method stub
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos mostrarArticulosID(int id) {
		// TODO Auto-generated method stub
		return iArticulosDAO.findById((long) id).get();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		// TODO Auto-generated method stub
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int id) {
		// TODO Auto-generated method stub
		iArticulosDAO.deleteById((long)id);
	}

}
