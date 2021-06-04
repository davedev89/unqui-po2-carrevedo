package ar.unq.po2.tp04.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp04.mercadoCentral.Caja;
import ar.unq.po2.tp04.mercadoCentral.Impuesto;
import ar.unq.po2.tp04.mercadoCentral.ProductoCooperativo;
import ar.unq.po2.tp04.mercadoCentral.ProductoTradicional;
import ar.unq.po2.tp04.mercadoCentral.Servicio;


class CajaTest {
	
	private Caja unaCaja;
	private ProductoTradicional pt1;
	private ProductoTradicional pt2;
	
	private ProductoCooperativo pc1;
	private ProductoCooperativo pc2;
	
	private Servicio s1;
	private Impuesto i1;
		

	@BeforeEach
	void setUp() throws Exception {
		
		unaCaja = new Caja();
		pt1 = new ProductoTradicional("Arroz", 75, 10);
		pt2 = new ProductoTradicional("Yerba", 120, 10);
		pc1 = new ProductoCooperativo("Miel", 90, 10);
		pc2 = new ProductoCooperativo("Cerveza", 210, 10);
		s1 = new Servicio(15, 100);
		i1 = new Impuesto(250);
		
	}

	@Test
	void testResgistrarProductos() {
		
		assertEquals(unaCaja.getProductos().size(), 0);
		
		unaCaja.resgistrarProducto(pc1);
		assertEquals(unaCaja.getProductos().size(), 1);
		
		unaCaja.resgistrarProducto(s1);
		assertEquals(unaCaja.getProductos().size(), 2);
	}
	
	@Test
	void testSumarProductos() {
		
		unaCaja.resgistrarProducto(pc1);
		unaCaja.resgistrarProducto(pt1);
		unaCaja.resgistrarProducto(s1);
		unaCaja.resgistrarProducto(i1);
		assertEquals(unaCaja.getSumaTotal(),1906);
		
	}
	
	
}
