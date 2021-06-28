package ar.unq.po2.tp03.encapsulamiento;

import java.time.LocalDate;
import java.util.Date;

	
public class Persona {
	
	String nombre;
	String apellido;
    LocalDate fecNac;
	CalculadoraDeEdad calculadoraDeEdad;
	
	
	public Persona (String nomb, String apell, LocalDate fecN) {
		this.nombre = nomb;
		this.apellido = apell;
		this.fecNac = fecN;
		calculadoraDeEdad = new CalculadoraDeEdad();
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
	
	public LocalDate getFecNac() {
		return fecNac;
	}
	
	public void setFecNac(LocalDate fecha) {
		this.fecNac = fecha;
	}
	
	public double getEdad() {
		return calculadoraDeEdad.calcularEdad(this.fecNac);
		
	}
		
	public boolean menorQue (Persona persona) {
		return this.getEdad() < persona.getEdad();
		
	}

}
