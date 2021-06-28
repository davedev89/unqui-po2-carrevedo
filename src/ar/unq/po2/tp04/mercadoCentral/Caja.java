package ar.unq.po2.tp04.mercadoCentral;

public class Caja {
	private double totalAPagar;
	private Agencia agencia;

	public Caja(Agencia agencia) {
		this.totalAPagar = (0.00f);
		this.agencia = agencia;
	}
	
	public double getTotalAPagar() {
		return this.totalAPagar;
	}

	public void registrarPagable(Pagable pagable) {
		pagable.registrarEnCaja(this);
	}

	public void incrementarMontoAPagar(double precio) {
		this.totalAPagar = this.getTotalAPagar()+precio;
	}
}

