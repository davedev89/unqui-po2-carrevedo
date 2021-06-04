package ar.unq.po2.tp03.unq;

import java.util.ArrayList;

public class Counter {

	private ArrayList <Integer> numbers;
	
	public Counter() {
		this.numbers = new ArrayList <Integer>();
	}
	
	public ArrayList<Integer> getNumbers() {
		return this.numbers;
	}
	
	public void addNumber(int number) {
		this.numbers.add(number);
	}
	
	
	public int getEvenOcurrences() {
		return (int) this.getNumbers().stream().filter(numero -> this.esPar(numero)).count();
	}
		
	public int getOddOcurrences() {
		return (int) this.getNumbers().stream().filter(numero -> !this.esPar(numero)).count();
	}
	
	
	public int contarMultiplos(int referencia) {
		return (int) this.getNumbers().stream().filter(numero -> this.esMultiploDe(numero,referencia)).count();
	}
	
	private boolean esPar(int valor ) {
		return this.esMultiploDe (valor, 2);
	}
	
	private boolean esMultiploDe (int valor, int referencia) {
		return valor % referencia == 0;
	}
	
	
	
}
