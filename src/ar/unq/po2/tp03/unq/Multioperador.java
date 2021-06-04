package ar.unq.po2.tp03.unq;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList <Integer> numeros;
	
	public Multioperador() {
		this.numeros = new ArrayList<Integer>();
	}
	
	
	//Getters y setters
	
	public ArrayList<Integer> getNumeros() {
		return this.numeros;
	}
	
	public void addNumber (Integer numero) {
		this.numeros.add(numero);
	}
	
	//Operaciones
	
	public Integer sumar() {
		return this.getNumeros().stream().reduce(0,(a,b) -> a+b);
	}
	
	public Integer restar() {
		return this.getNumeros().stream().reduce(0,(a,b) -> a-b);
	}
	
	public Integer multiplicar () {
		return this.getNumeros().stream().reduce(1,(a,b) -> a*b);
	}

}
