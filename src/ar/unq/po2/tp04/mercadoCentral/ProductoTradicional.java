package ar.unq.po2.tp04.mercadoCentral;

public class ProductoTradicional extends Producto {

	public ProductoTradicional(String nom, double precio, int sto) {
		super(nom, precio, sto);
	}

	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return this.getprecioBase();
	}

}
