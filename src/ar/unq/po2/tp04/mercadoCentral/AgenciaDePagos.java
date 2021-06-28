package ar.unq.po2.tp04.mercadoCentral;

public class AgenciaDePagos implements Agencia{

	private String nombre;
	
	public AgenciaDePagos(String nombre) {
		this.nombre = nombre;
	}
	
	public void registrarPago(Factura factura) {
		System.out.println(String.format("Se registra un pago con el monto con un monto de $ %.2f", factura.precioFinal()));
	}
}
