package ar.unq.po2.tp04.mercadoCentral;

public abstract class Producto implements Pagable {

	private double precio;
	private int stock;
	private String nombre;
	
	public Producto(double precio, int stock, String nombre) {
		this.precio = precio;
		setStock(stock);
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		setStock(getStock()-1);
	}
	
	public boolean hayStock() {
		return this.getStock() > 0;
	}
	
	public abstract double precioFinal();
	
	public void registrarEnCaja(Caja caja) {
		if(this.hayStock()) {
			caja.incrementarMontoAPagar(this.precioFinal());
			this.decrementarStock();
		}
		else {
			System.out.println("Producto sin stock disponible");
		}
	}
}
