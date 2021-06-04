package ar.unq.po2.tp03.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unq.po2.tp03.unq.Multioperador;

import org.junit.Before;


class MultioperadorTest {
	
	Multioperador multi;

	@Before
	
	public void setUp() throws Exception {
		
		multi = new Multioperador();
		
		multi.addNumber(10);
		multi.addNumber(1);
		multi.addNumber(1);
		multi.addNumber(1);
		multi.addNumber(1);
		
		
	}
	
	
	@Test
	void sumaTest() {
		
		int suma = multi.sumar();
		System.out.println(suma);
		
		assertEquals (suma , 14);
		
	}
	
	@Test
	void restaTest() {
		
		int resta = multi.restar();
		System.out.println(resta);
		
		assertEquals (resta , 6);
		
	}
	
	@Test
	void multiplicacionTest() {
		
		int multiplicacion = multi.multiplicar();
		System.out.println(multiplicacion);
		
		assertEquals (multiplicacion , 10);
		
	}
}
