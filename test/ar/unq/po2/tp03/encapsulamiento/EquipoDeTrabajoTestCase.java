package ar.unq.po2.tp03.encapsulamiento;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	private EquipoDeTrabajo equipo;
	private Persona persona1;
	private Persona persona2;
	LocalDate fecha1;
	LocalDate fecha2;
	

	@BeforeEach
	void setUp() throws Exception {
		fecha1 = LocalDate.of(1989, 5, 24);
		fecha2 = LocalDate.of(1989, 10, 24);
		equipo = new EquipoDeTrabajo("equipo1");
		persona1 = new Persona("David","Carrevedo", fecha1 );
		persona2 = new Persona("Pepe","Carrevedo", fecha2 );
	}

	@Test
	void testEquipoAgregaPersonas() {
		this.equipo.addIntegrante(persona1);
		this.equipo.addIntegrante(persona2);
		
		int resultado = this.equipo.getIntegrantes().size();
		assertEquals(resultado, 2);
	}
	
	@Test
	void testPromedioDeEdades() {
		this.equipo.addIntegrante(persona1);
		this.equipo.addIntegrante(persona2);
		
		System.out.println("El promedio de edades es "+ this.equipo.promedioEdades());
	}

}
