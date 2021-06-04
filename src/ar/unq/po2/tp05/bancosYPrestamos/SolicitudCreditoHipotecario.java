package ar.unq.po2.tp05.bancosYPrestamos;

public class SolicitudCreditoHipotecario extends Solicitud {
	
	private Propiedad propiedad;

	public SolicitudCreditoHipotecario(Cliente cli, double mon, int pla, Propiedad prop) {
		super(cli, mon, pla);
		this.setPropiedad(prop);
	}
	
	public void setPropiedad(Propiedad prop) {
		// TODO Auto-generated method stub
		this.propiedad = prop;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}

	public boolean esAceptable() {
		return this.getCliente().getSueldoNetoMensual() / 2 >= this.getMonto() &&
				this.getMonto()< this.getPropiedad().getValorFiscal() * 0.7 &&
				this.getCliente().getEdad() + (this.getPlazo() * 0.12) > 65;
				}

}
