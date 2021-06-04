package ar.unq.po2.tp04.mercadoCentral;

public class Servicio implements Facturable {
	
	private int costoPorUnidad;
	private int unidadesConsumidas;
	
	public Servicio (int costoUnidad, int cantUnidades) {
		this.costoPorUnidad = costoUnidad;
		this.unidadesConsumidas = cantUnidades;
	}
	

	@Override
	public double obtenerPrecioTotal() {
		
		return this.costoPorUnidad * this.unidadesConsumidas;
	}



}
