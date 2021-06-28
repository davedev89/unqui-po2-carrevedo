package ar.unq.po2.tp04.mercadoCentral;

public class FacturaDeImpuesto extends Factura {
	
	private double tasa;
	
	public FacturaDeImpuesto(double tasa) {
		this.tasa = tasa;
	}

	public double precioFinal() {
		return this.tasa;
	}

}


