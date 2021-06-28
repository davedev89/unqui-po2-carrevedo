package ar.unq.po2.tp03.encapsulamiento;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class EquipoDeTrabajo {
	
	String nombre;
	ArrayList <Persona> equipo;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
		equipo = new ArrayList <Persona> ();
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public ArrayList<Persona> getIntegrantes() {
		return equipo;
	}
	
	public void addIntegrante(Persona persona) {
		this.getIntegrantes().add(persona);
	}
	
	public OptionalDouble promedioEdades() {
		
		return equipo.stream().mapToDouble(persona -> persona.getEdad()).average();
		
	}

}
