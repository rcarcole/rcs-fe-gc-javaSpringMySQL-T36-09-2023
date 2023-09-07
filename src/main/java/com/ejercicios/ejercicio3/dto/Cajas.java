package com.ejercicios.ejercicio3.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cajas") 
public class Cajas {

	@Id
	@Column(name="num_referencia", length=5)
	private String NumReferencia;
	
	@Column(name="contenido")
	private String contenido;
	
	@Column(name="valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacenes")
	Almacenes almacenes;

	public Cajas() {}
	
	public Cajas(String numReferencia, String contenido, int valor, Almacenes almacenes) {
		this.NumReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacenes = almacenes;
	}

	public String getNumReferencia() {
		return NumReferencia;
	}

	public void setNumReferencia(String numReferencia) {
		NumReferencia = numReferencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(Almacenes almacenes) {
		this.almacenes = almacenes;
	}

	@Override
	public String toString() {
		return "Cajas [NumReferencia=" + NumReferencia + ", contenido=" + contenido + ", valor=" + valor
				+ ", almacenes=" + almacenes + "]";
	}
		
}
