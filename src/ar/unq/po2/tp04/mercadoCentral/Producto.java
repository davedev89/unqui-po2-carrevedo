package ar.unq.po2.tp04.mercadoCentral;

public abstract class Producto implements Facturable {
	
	private String nombre;
	private double precioBase;
	//private boolean cooperativo;
	private int stock;
	
	public Producto(String nom, double precio, int sto) {
		this.nombre = nom;
		this.precioBase = precio;
		//this.setCooperativo(esCoop);
		this.stock = sto;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public double getprecioBase () {
		return precioBase;
	}
	
	public void setPrecioBase(double precio) {
		this.precioBase = precio;
	}
	
	//public boolean esCooperativo() {
	//	return this.setCooperativo(true);
	//}
	
	public void descontarDeStock(int cantidad) {
		this.stock = this.stock - cantidad;
	}
	
	
	public abstract double obtenerPrecioTotal();

	
	// los siguientes metodos fueron generados automaticos, a prueba
	
	/*public boolean isCooperativo() {
		return cooperativo;
	}

	public boolean setCooperativo(boolean cooperativo) {
		this.cooperativo = cooperativo;
		return cooperativo;
	}*/
	

}
