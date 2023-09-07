package com.ejercicios.ejercicio2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departamentos") 
public class Departamentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="presupuesto")
	private int presupuesto;

	@OneToMany(mappedBy="departamentos")
	private List<Empleados> empleados;
	
	public Departamentos() {}

	public Departamentos(int codigo, String nombre, int presupuesto, List<Empleados> empleados) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleados = empleados;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY)
	public List<Empleados> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto
				+ ", empleados=" + empleados + "]";
	}
	
}
