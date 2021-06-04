package ar.unq.po2.tp03.unq;



public class Cuadrado {
	
	private Point punto;
	private double ancho;
	private double alto;
	
	public Cuadrado (Point punto, double anchoYAlto) {
		
		this.setPunto(punto);
		this.setAncho(anchoYAlto);
		this.setAlto(anchoYAlto);
		
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

}
