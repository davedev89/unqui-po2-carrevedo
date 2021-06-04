package ar.unq.po2.tp05.bancosYPrestamos;

public abstract class Solicitud {
	
	private Cliente cliente;
	private double monto;
	private int plazo;
	
	
	public Solicitud(Cliente cli, double mon, int pla) {
		this.setCliente(cli);
		this.setMonto(mon);
		this.setPlazo(pla);
	}
	
	public double cuotaMensual() {
		return getMonto() / getPlazo() ;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
	
	

}
