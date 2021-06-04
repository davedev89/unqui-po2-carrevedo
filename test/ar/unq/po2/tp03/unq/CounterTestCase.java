package ar.unq.po2.tp03.unq;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp03.unq.Counter;

public class CounterTestCase {
	
	
	private Counter counter;
		/**
		* Crea un escenario de test básico, que consiste en un contador
		* con 10 enteros
		*
		* @throws Exception
		*/
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	/**
	* Verifica la cantidad de impares
	*/
	@Test
	public void testOddNumbers() {
		// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	/**
	* Verifica la cantidad de multiplos de un numero dado como referencia
	*/
	@Test
	public void testMultipleNumbers() {
		// Getting the multiples occurrences
		int amount = counter.contarMultiplos(4);
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	
}