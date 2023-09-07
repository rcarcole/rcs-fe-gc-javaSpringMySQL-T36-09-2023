package com.ejercicios.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicios.ejercicio1.dto.Articulos;

public interface IArticulosDAO  extends JpaRepository<Articulos, Long>{

}
