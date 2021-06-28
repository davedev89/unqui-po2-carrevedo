package ar.unq.po2.tp03.encapsulamiento;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp03.encapsulamiento.Persona;

class PersonaTestCase {
	
	private Persona unaPersona;
    private Persona otraPersona;
	private LocalDate fecha1;
	private LocalDate fecha2;
	private CalculadoraDeEdad calculadora;
	private double edad1;
	private double edad2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		fecha1 = LocalDate.of(1989, 5, 24);
		fecha2 = LocalDate.of(1992, 1, 9);
		calculadora = new CalculadoraDeEdad();
		unaPersona = new Persona ("David", "Carrevedo", fecha1);
		otraPersona = new Persona ("Damaris", "Berrios", fecha2);
		
	}
	
	@Test
	void testCreation() {
		assertNotNull(this.unaPersona);
	}

	@Test
	void testEdad() {
		
		edad1 = this.unaPersona.getEdad();
		edad2 = this.otraPersona.getEdad();

		assertEquals (edad1, 32);
		assertEquals (edad2, 29);
	}
	
	@Test
	void testMenorQuePersona() {

		assertFalse (unaPersona.menorQue(otraPersona));
		
	}

}
