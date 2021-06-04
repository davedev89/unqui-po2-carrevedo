package ar.unq.po2.tp05.bancosYPrestamos;

public class Propiedad {
	
	String direccion;
	double valorFiscal;
	
	public Propiedad(String direccion, double valorFiscal) {
		super();
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	

}
