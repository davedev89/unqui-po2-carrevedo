package ar.unq.po2.tp03.encapsulamiento;

import java.sql.Date;

	
public class Persona {
	
	String nombre;
	String apellido;
	Date fecNac;
	CalculadoraDeEdad calculadoraDeEdad;
	
	
	public Persona (String nomb, String apell, Date fecN) {
		this.nombre = nomb;
		this.apellido = apell;
		this.fecNac = fecN;
	}
		
	//Getters y Setters 
	public String getName() {
		return nombre;
	}
	
	public void setName(String name) {
		this.nombre = name;
	}
	
	public String getSurname() {
		return apellido;
	}
	
	public void setSurname(String surname) {
		this.apellido = surname;
	}
	
	public Date getFecNac() {
		return fecNac;
	}
	
	public void setFecNac(Date fecha) {
		this.fecNac = fecha;
	}
	
	public double getEdad() {
		
		
		return calculadoraDeEdad.calcularEdad(this.fecNac);
		
	}
	
	
	public boolean menorQue (Persona persona) {
		
		return this.getEdad() < persona.getEdad();
		
	}

}
