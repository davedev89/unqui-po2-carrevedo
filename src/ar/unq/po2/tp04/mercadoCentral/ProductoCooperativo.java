package ar.unq.po2.tp04.mercadoCentral;

public class ProductoCooperativo extends Producto {

	public ProductoCooperativo(String nom, double precio, int sto) {
		super(nom, precio, sto);
		
	}

	@Override
	public double obtenerPrecioTotal() {
		
		return this.getprecioBase() * 0.9;
	}
	
	

}
