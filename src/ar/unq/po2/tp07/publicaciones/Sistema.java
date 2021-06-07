package ar.unq.po2.tp07.publicaciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sistema {
	
	List<Articulo> articulos;
	Map<Suscriptor, Criterio> suscripciones;

	public Sistema() {
		this.setArticulos(new ArrayList<Articulo>());
		this.setSuscripciones(new HashMap<Suscriptor, Criterio>());
	}
	
	public List<Articulo> getArticulos() {
		return articulos;
	}

	private void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Map<Suscriptor, Criterio> getSuscripciones() {
		return suscripciones;
	}

	private void setSuscripciones(Map<Suscriptor, Criterio> suscriptores) {
		this.suscripciones = suscriptores;
	}

	public void agregarArticulo(Articulo articulo) {
		this.getArticulos().add(articulo);
		this.notificarSuscriptores(articulo);
	}
	
	public void suscribir(Suscriptor suscriptor, Criterio criterio) {
		this.getSuscripciones().put(suscriptor, criterio);
	}
	
	public void desuscribir(Suscriptor suscriptor) {
		this.getSuscripciones().remove(suscriptor);
	}
	
	public void notificarSuscriptores(Articulo articulo) {
		for (Entry<Suscriptor, Criterio> suscripcion : this.getSuscripciones().entrySet()) {
			if (suscripcion.getValue().esDeInteres(articulo)) {
				suscripcion.getKey().actualizar(articulo);
			}
		}
	}

}