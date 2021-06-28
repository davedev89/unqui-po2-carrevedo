package ar.unq.po2.tp04.mercadoCentral;

public class FacturaDeServicio extends Factura {

	private double unidadesConsumidas;
	private double costoPorUnidad;
	
	public FacturaDeServicio(double unidadesConsumidad, double costoPorUnidad) {
		this.unidadesConsumidas = unidadesConsumidad;
		this.costoPorUnidad = costoPorUnidad;
	}

	public double precioFinal() {
		return this.costoPorUnidad * this.unidadesConsumidas;
	}
}
