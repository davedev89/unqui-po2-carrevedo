package ar.unq.po2.tp03.unq;

public class Point {
	
	double x;
	double y;
	
	public Point(double x, double y) {
		
		this.setX(x);
		this.setY(y);
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
		
	
	// Caso si no me pasan parametros
	
	public Point() {
		
		this.setX(0);
		this.setY(0);
	}

	//Mover punto a otra posicion

	public void moverPuntoA (double x, double y) {
		
		this.setX(x);
		this.setY(y);
		
	}
	
	//Sumarse con otro punto
	
	public void sumarPunto (Point punto) {
		
		this.setX(this.getX() + punto.getX() );
		this.setY(this.getY() + punto.getY() );
	}
	

}
