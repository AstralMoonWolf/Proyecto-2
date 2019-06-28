package com.lucatinder.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class User {

	private int id;
	private String nombre;
	private String genero;
	private Date edad;
	private String poblacion;
	private int idintereses;
	private String descripcion;
	
	@Id
	@GeneratedValue
	@Column(name = "idusuario")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getEdad() {
		return edad;
	}
	public void setEdad(Date edad) {
		this.edad = edad;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	@Column(name = "idintereses")
	public int getIdIntereses() {
		return idintereses;
	}
	public void setIdIntereses(int idintereses) {
		this.idintereses = idintereses;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
