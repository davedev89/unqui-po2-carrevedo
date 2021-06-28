package ar.unq.po2.tp04.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp04.mercadoCentral.Producto;
import ar.unq.po2.tp04.mercadoCentral.ProductoCooperativa;

class ProductoCooperativaTestCase {

	private Producto manaos;
	private Caja caja; 
	private AgenciaDePagos a1;
	
	

	@BeforeEach
    public void setUp() throws Exception {
		
		this.manaos = new ProductoCooperativa(80,20,"Manaos");	
		this.a1 = new AgenciaDePagos("Rapipago");
		this.caja = new Caja(a1);
	}
	
	
	@Test
	void testStock() {
		assertEquals(manaos.getStock(),20);
	}
	
	@Test
	void testPrecioRegistrado() {
		assertEquals(manaos.getPrecio(),80);
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(manaos.precioFinal(),72);
	}
	
	@Test
	void testDescontarStock() {
		manaos.decrementarStock();
		assertEquals(manaos.getStock(),19);
	}
	
	@Test
	void testRegistrarEnCaja() {
		manaos.registrarEnCaja(caja);
		assertEquals(manaos.getStock(),19);
	}
}
