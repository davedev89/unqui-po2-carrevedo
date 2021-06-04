package ar.unq.po2.tp03.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unq.po2.tp03.unq.Point;

class PointTestCase {
	
	Point unPunto;
	Point otroPunto;

	@Test
	void constructorTest() {
		
		unPunto = new Point(3,4);
		
		System.out.println("Un punto ubicado en X = " + unPunto.getX() + ", Y = " + unPunto.getY());
		
		assertEquals (unPunto.getX(), 3);

		
	}
	
	@Test
	void constructorSinParametrosTest() {
		
		unPunto = new Point();
		
		System.out.println("Un punto ubicado en X = " + unPunto.getX() + ", Y = " + unPunto.getY());
		
		assertEquals (unPunto.getX(), 0);

		
	}
	
	@Test
	void cambiarUbicacionPunto() {
		
		unPunto = new Point();
		
		System.out.println("Un punto ubicado en X = " + unPunto.getX() + ", Y = " + unPunto.getY());
		
		assertEquals (unPunto.getX(), 0);
		
		unPunto.moverPuntoA(0.8, 5.3);
		
		System.out.println("Nueva ubicacion, X = " + unPunto.getX() + ", Y = " + unPunto.getY());
		
		assertEquals (unPunto.getX(), 0.8);

		
	}
	
	
	@Test
	void sumarPunto() {
		
		unPunto = new Point(1,4);
		otroPunto = new Point(3,2);
		
		System.out.println("Un punto ubicado en X = " + unPunto.getX() + ", Y = " + unPunto.getY());
		
		assertEquals (unPunto.getX(), 1);
		
		unPunto.sumarPunto(otroPunto);
		
		System.out.println("Nueva ubicacion, X = " + unPunto.getX() + ", Y = " + unPunto.getY());
		
		assertEquals (unPunto.getX(), 4);
		assertEquals (unPunto.getY(), 6);

		
	}

}
