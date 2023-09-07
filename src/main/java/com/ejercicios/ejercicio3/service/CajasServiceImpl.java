package com.ejercicios.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio3.dao.ICajasDAO;
import com.ejercicios.ejercicio3.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService{

	@Autowired
	ICajasDAO iCajasDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas mostrarCajasID(String referencia) {
		// TODO Auto-generated method stub
		return iCajasDAO.findById(referencia).get();
	}

	@Override
	public Cajas guardarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		// TODO Auto-generated method stub
		return iCajasDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String referencia) {
		// TODO Auto-generated method stub
		iCajasDAO.deleteById(referencia);
	}

}
