package ar.unq.po2.tp07.publicaciones;

import java.util.ArrayList;

public class SistemaDeReferencias {
	
	private ArrayList <Articulo> articulosCargados;
	private ArrayList <ISuscripcion> suscriptos;
	
	public SistemaDeReferencias() {
		
		this.articulosCargados = new ArrayList<Articulo>();;
		this.suscriptos = new ArrayList<ISuscripcion>();
	}

	public ArrayList <Articulo> getArticulosCargados() {
		return articulosCargados;
	}

	public void setArticulosCargados(ArrayList <Articulo> articulosCargados) {
		this.articulosCargados = articulosCargados;
	}

	public ArrayList <ISuscripcion> getSuscriptos() {
		return suscriptos;
	}

	public void setSuscriptos(ArrayList <ISuscripcion> suscriptos) {
		this.suscriptos = suscriptos;
	}
	
	
	public void suscribir(ISuscripcion susc) {
		this.getSuscriptos().add(susc);
	}
	
	public void desuscribir(ISuscripcion susc) {
		this.getSuscriptos().remove(susc);
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.articulosCargados.add(articulo);
		this.notificar(articulo);
	}
	
	public void notificar(Articulo articulo) {
		
		
		for ( ISuscripcion suscriptor : this.getSuscriptos()) {
			if (suscriptor.getIntereses().stream().anyMatch(interes -> articulo.getTemas().contains(interes))) {
				suscriptor.update(articulo);
			}
		}
		
		

	}
}
