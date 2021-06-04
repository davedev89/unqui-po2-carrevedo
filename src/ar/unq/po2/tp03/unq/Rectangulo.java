package ar.unq.po2.tp03.unq;

public class Rectangulo {
	
	private Point punto;
	private double ancho;
	private double alto;
	
	public Rectangulo (Point punto, double ancho, double alto) {
		
		this.setPunto(punto);
		this.setAncho(ancho);
		this.setAlto(alto);
		
	}
	
	public double getAlto () {
		return alto;
	}
	public void setAlto(double alto2) {
		// TODO Auto-generated method stub
		this.alto = alto2;
	}
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho2) {
		// TODO Auto-generated method stub
		this.ancho = ancho2;
	}

	public void setPunto(Point punto2) {
		// TODO Auto-generated method stub
		this.punto = punto2;
	}
	
	public Point getPunto() {
		return punto;
	}

	public double area() {
		
		return this.getAncho() * this.getAlto();
		
	}
	
	public double perimetro() {
		return (this.getAncho () + this.getAncho()) *2;
	}
	
	public boolean esHorizontal () {
		return this.getAncho() > this.getAlto();
	}

}
