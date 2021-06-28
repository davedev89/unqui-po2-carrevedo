package ar.unq.po2.tp04.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp04.mercadoCentral.Caja;
import ar.unq.po2.tp04.mercadoCentral.Producto;
import ar.unq.po2.tp04.mercadoCentral.ProductoCooperativa;
import ar.unq.po2.tp04.mercadoCentral.ProductoEmpresaTradicional;

class CajaTestCase {

	
	private Producto p1;
	private Producto p2;
	private Producto p3;
	private Producto p4;
	private AgenciaDePagos a1;
	private Factura f1;
	private Factura f2;
	private Caja caja; 
	
    
	@BeforeEach
    public void setUp() throws Exception {

	this.p1 = new ProductoCooperativa(80,20,"Manaos");	
	this.p2 = new ProductoEmpresaTradicional(99,20,"Coca-Cola");	
	this.p3 = new ProductoCooperativa(50,20,"Pehuamar");	
	this.p4 = new ProductoEmpresaTradicional(70,20,"Lays");	
	this.a1 = new AgenciaDePagos("Rapipago");
	this.f1 = new FacturaDeImpuesto(500);
	this.f2 = new FacturaDeServicio(500,2.50);
	this.caja = new Caja(a1);
	
	}
	
	
	@Test
	void testTotalAPagarProductos() {
		
		this.caja.registrarPagable(p1);
		this.caja.registrarPagable(p2);
		this.caja.registrarPagable(p3);
		assertEquals(caja.getTotalAPagar(), 216);
	}
		
	@Test
	void testTotalAPagarFacturas() {
		
		this.caja.registrarPagable(f1);
		this.caja.registrarPagable(f2);
		assertEquals(caja.getTotalAPagar(), 1750);
	}
	
	@Test
	void testRegistrarProducto() {
		
		this.caja.registrarPagable(p1);
		assertEquals(caja.getTotalAPagar(), 72);
		assertEquals(p1.getStock(), 19);
	}
	
	@Test
	void testTotalAPagarProductosYFacturas() {
		
		this.caja.registrarPagable(p1);
		this.caja.registrarPagable(p2);
		this.caja.registrarPagable(p3);
		this.caja.registrarPagable(f1);
		this.caja.registrarPagable(f2);
		assertEquals(caja.getTotalAPagar(), 1966);
	}

}
