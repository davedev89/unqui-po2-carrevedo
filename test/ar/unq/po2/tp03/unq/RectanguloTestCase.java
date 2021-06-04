package ar.unq.po2.tp03.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp03.unq.Cuadrado;
import ar.unq.po2.tp03.unq.Point;
import ar.unq.po2.tp03.unq.Rectangulo;

class RectanguloTestCase {
	
	Rectangulo unRectangulo;
	Point unPunto;
	Cuadrado unCuadrado;
	
	@Before
	public void setUp() {
		
		unPunto = new Point(5,4);
		unRectangulo = new Rectangulo (unPunto, 8, 6);
		
		
	}

	@Test
	void creacionTest() {
		
		unPunto = new Point(5,4);
		unRectangulo = new Rectangulo (unPunto, 8, 6);

		assertEquals(unRectangulo.getAlto(), 6);
		
		
	}
	
	@Test
	void testArea() {
		unPunto = new Point(5,4);
		unRectangulo = new Rectangulo (unPunto, 8, 6);
		assertEquals(48, unRectangulo.area());
	}
	
	@Test
	void esHorizontal() {
		unPunto = new Point(5,4);
		unRectangulo = new Rectangulo (unPunto, 8, 6);
		
		assertTrue (unRectangulo.esHorizontal());
	}
	
	@Test
	void esVertical() {
		unPunto = new Point(5,4);
		unRectangulo = new Rectangulo (unPunto, 6, 8);
		
		assertFalse (unRectangulo.esHorizontal());
	}
	
	@Test
	void esCuadrado() {
		
		unPunto = new Point(5,4);
		unCuadrado = new Cuadrado (unPunto, 6);
		
		assertTrue(unCuadrado.getAncho() == unCuadrado.getAlto());
		
	}

}
