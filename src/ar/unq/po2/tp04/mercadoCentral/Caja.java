package ar.unq.po2.tp04.mercadoCentral;

import java.util.ArrayList;

public class Caja implements Agencia {
	
	private ArrayList <Facturable> facturablesRegistrados;
	
	public Caja () {
		
		this.facturablesRegistrados = new ArrayList<Facturable>();
		
	}
	
	public ArrayList<Facturable> getProductos() {
		return facturablesRegistrados;
	}
	
	public void resgistrarProducto(Facturable facturable) {
		facturablesRegistrados.add(facturable);
	}
	
	public double getSumaTotal() {
		return this.facturablesRegistrados.stream().mapToDouble(p -> p.obtenerPrecioTotal()).sum();
	}

	@Override
	public void registrarPago(Facturable factura) {

		//falta diferenciar cuales son facturas y no productos
		
	}
	
	

}
