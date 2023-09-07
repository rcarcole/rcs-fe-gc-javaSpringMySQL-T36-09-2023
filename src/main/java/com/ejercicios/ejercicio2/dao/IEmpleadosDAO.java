package com.ejercicios.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicios.ejercicio2.dto.Empleados;

public interface IEmpleadosDAO extends JpaRepository<Empleados, String>{

}
