package ar.unq.po2.tp05.bancosYPrestamos;

public class SolicitudCreditoPersonal extends Solicitud {

	public SolicitudCreditoPersonal(Cliente cli, double mon, int pla) {
		super(cli, mon, pla);
		// TODO Auto-generated constructor stub
	}
	
	public boolean esAceptable() {
		return this.getCliente().sueldoNetoAnual >= 15000 &&
				this.cuotaMensual() < (this.getCliente().sueldoNetoMensual * 0.7);
	}

}
