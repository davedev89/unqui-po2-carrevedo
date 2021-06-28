package ar.unq.po2.tp04.mercadoCentral;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(double precio, int stock, String nombre) {
		super(precio, stock, nombre);
	}
	
	@Override
	public double precioFinal() {
		return getPrecio() - ((getPrecio() * 10) / 100);
	}

}
