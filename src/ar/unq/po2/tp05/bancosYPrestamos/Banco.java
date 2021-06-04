package ar.unq.po2.tp05.bancosYPrestamos;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList <Cliente> clientes;
	private ArrayList <Solicitud> solicitudes;
	
	
	public Banco () {
		this.clientes = new ArrayList <Cliente>();
		this.setSolicitudes(new ArrayList <Solicitud>());
		
	}

	public void agregarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clientes.add(cliente);
	}
	
	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public void solicitarCreditoPersonal(Cliente cliente1, double i, int j) {
		// TODO Auto-generated method stub
		SolicitudCreditoPersonal solicitud = new SolicitudCreditoPersonal (cliente1, i, j);
		this.getSolicitudes().add(solicitud);
		
	}

	public ArrayList <Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList <Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	
	public void solicitarCreditoHipotecario (Cliente cliente, double monto, 
			int plazo, String dirPropiedad, double valorPropiedad) {
		Propiedad propiedad = new Propiedad (dirPropiedad, valorPropiedad);
		SolicitudCreditoHipotecario solicitud = new SolicitudCreditoHipotecario(cliente, monto, plazo, propiedad);
		this.getSolicitudes().add(solicitud);
	}

	public int getMontoADesembolsar() {
		
		// Agregar lambda para sumar en arraylist
		
		return this.getSolicitudes().stream(). //falta 
	}

		

}
