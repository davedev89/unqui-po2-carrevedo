package ar.unq.po2.tp03.encapsulamiento;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp03.encapsulamiento.Persona;

class personaTest {
	
	Persona unaPersona;
	Persona otraPersona;
	Date fecha1;
	

	@Before
	static void setUp() throws Exception {
		
		//no pude manejar correctamente el envio de fechas como parametros
		
		
		unaPersona = new Persona ("David", "Carrevedo", new Date(24,5,1989));
		otraPersona = new Persona ("Damaris", "Berrios", '09/01/1992');
		
	}

	@Test
	void testEdad() {

		assertEquals (unaPersona.getEdad(), 31);
		assertEquals (otraPersona.getEdad(), 29);
	}
	
	@Test
	void testMenorQuePersona() {

		assertFalse (unaPersona.menorQue(otraPersona));
		
	}

}
