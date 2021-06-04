package ar.unq.po2.tp04.mercadoCentral;

public class Impuesto implements Facturable {
	
	private double tasa;
	
	public Impuesto(double tasa) {
		this.tasa = tasa;
	}

	@Override
	public double obtenerPrecioTotal() {
	
		return this.tasa;
	}

	
}
