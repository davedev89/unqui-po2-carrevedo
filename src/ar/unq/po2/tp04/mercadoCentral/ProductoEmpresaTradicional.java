package ar.unq.po2.tp04.mercadoCentral;

public class ProductoEmpresaTradicional extends Producto {

	public ProductoEmpresaTradicional(double precio, int stock, String nombre) {
		super(precio, stock, nombre);
	}
	
	@Override
	public double precioFinal() {
		return getPrecio();
	}
}