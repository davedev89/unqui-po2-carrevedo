package ar.unq.po2.tp04.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp04.mercadoCentral.Producto;
import ar.unq.po2.tp04.mercadoCentral.ProductoEmpresaTradicional;

class ProductoEmpresaTradicionalTestCase {

	private Producto coca;
	private Caja caja; 
	private AgenciaDePagos a1;
    
	@BeforeEach
    public void setUp() throws Exception {
		
		this.coca = new ProductoEmpresaTradicional(130.99f,110,"Coca-Cola");	
		this.a1 = new AgenciaDePagos("Rapipago");
		this.caja = new Caja(a1);
	}
	

	@Test
	void testStock() {
		assertEquals(coca.getStock(),110);
	}
	
	@Test
	void testPrecioRegistrado() {
		assertEquals(coca.getPrecio(),130.99f);
	}
	
	@Test
	void testPrecioFinal() {
		assertEquals(coca.precioFinal(),130.99f);
	}
	
	@Test
	void testDescontarStock() {
		coca.decrementarStock();
		assertEquals(coca.getStock(),109);
	}
	
	@Test
	void testRegistrarEnCaja() {
		coca.registrarEnCaja(caja);
		assertEquals(coca.getStock(),109);
	}
}
