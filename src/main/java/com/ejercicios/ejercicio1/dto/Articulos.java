package com.ejercicios.ejercicio1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="articulos") 
public class Articulos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="precio")
	private int precio;

	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricantes fabricante;

	public Articulos() {}

	public Articulos(int codigo, String nombre, int precio, Fabricantes fabricante) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
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


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public Fabricantes getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}


	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante="
				+ fabricante + "]";
	}
	
	
}
