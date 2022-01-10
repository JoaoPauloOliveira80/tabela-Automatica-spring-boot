package com.vigjoaopaulo.gmail.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personas {
	@Id
	private int id;
    private String nombres;
    private String apellidos;
    
    public Personas() {
    	
    }
    
	public Personas(int id, String nombres, String apellidos) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
    
    
    

}
