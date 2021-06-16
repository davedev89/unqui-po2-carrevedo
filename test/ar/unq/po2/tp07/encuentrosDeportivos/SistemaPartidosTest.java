package ar.unq.po2.tp07.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SistemaPartidosTest {
	private Sistema sistema;
	//private Partido partido1;
	//private Partido partido2;
	private ArrayList <Partido> partidos;
	//private Suscriptor suscriptor1;
	//private Suscriptor suscriptor2;
	private Map<Suscriptor, Interes> suscripciones;
	//private ArrayList<String> contrincantes;

	@BeforeEach
	void setUp() throws Exception {
		
		this.sistema = new Sistema();
		
	}

	@Test
	void testAgregarPartido() {
		
		Partido partido = mock(Partido.class);
		
		this.sistema.agregarPartido(partido);

		int resultado = this.sistema.getPartidos().size();
		
		assertEquals(1, resultado);
		
		
	}
	
	
	@Test
	
	void testAgregarPartidoYNotificarAInteresado() {
		
		Partido partido = mock(Partido.class);
		Servidor servidor = mock(Servidor.class);
		
		
		when(partido.getDeporte()).thenReturn("Futbol");
		when(servidor.getIntereses()).thenReturn("Futbol");
		
		this.sistema.agregarPartido(partido);
		this.sistema.agregarSuscriptor(servidor);
		
		
		verify (servidor).recibirPartido(partido);
		
	}

}
