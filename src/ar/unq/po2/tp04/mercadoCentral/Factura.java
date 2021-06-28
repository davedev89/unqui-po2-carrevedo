package ar.unq.po2.tp04.mercadoCentral;

public abstract class Factura implements Pagable {

	public void registrarEnCaja(Caja caja) {
		caja.incrementarMontoAPagar(this.precioFinal());
	}
	
	public abstract double precioFinal();
}
