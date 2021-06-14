package ar.unq.po2.tp07.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SistemaDeReferenciasTest {

	
	private SistemaDeReferencias sistema;
	ArrayList<String> temaArticulo = new ArrayList<String>();
	ArrayList<String> intereses1 = new ArrayList<String>();
	ArrayList<String> intereses2 = new ArrayList<String>();
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.sistema = new SistemaDeReferencias();
		this.temaArticulo.add("Anatomia");
		this.intereses1.add("Ciencias Naturales");
		this.intereses1.add("Anatomia");
		this.intereses2.add("Filosofia");
		this.intereses2.add("UNQ");
	}
	
	@Test
	void testAgregarArticulo() {
		Articulo articulo = mock(Articulo.class);
		this.sistema.agregarArticulo(articulo);
		int resultado = this.sistema.getArticulosCargados().size();
		
		assertEquals(1, resultado);
		
	}

	@Test
	void testAgregoArticuloEInformoASuscriptor() {
		
		Articulo articulo = mock(Articulo.class);
		Investigador investigador = mock(Investigador.class);
		
		when(articulo.getTemas()).thenReturn(temaArticulo);
		when(investigador.getIntereses()).thenReturn(intereses1);
		
		this.sistema.suscribir(investigador);
		this.sistema.agregarArticulo(articulo);
		
						
		verify(investigador).update(articulo);
		
	}

}
