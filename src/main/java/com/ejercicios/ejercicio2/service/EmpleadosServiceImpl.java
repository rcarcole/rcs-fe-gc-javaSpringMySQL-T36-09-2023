package com.ejercicios.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicios.ejercicio2.dao.IEmpleadosDAO;
import com.ejercicios.ejercicio2.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{

	@Autowired
	IEmpleadosDAO iEmpleadosDAO;
	
	@Override
	public List<Empleados> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados mostrarEmpleadosID(String id) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findById(id).get();
	}

	@Override
	public Empleados guardarEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public Empleados actualizarEmpleado(Empleados empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}
	
	@Override
	public void eliminarEmpleado(String id) {
		// TODO Auto-generated method stub
		iEmpleadosDAO.deleteById(id);
	}

}
