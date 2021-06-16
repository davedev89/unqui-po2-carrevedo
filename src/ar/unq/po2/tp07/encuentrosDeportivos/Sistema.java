package ar.unq.po2.tp07.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

public class Sistema {
	
	private ArrayList<Partido> partidos;
	private Map<Suscriptor, Interes> suscripciones;
	private ArrayList <Suscriptor> suscriptores;
	
	public Sistema() {
		super();
		this.setPartidos(new ArrayList<Partido>());;
		this.setSuscripciones(new HashMap<Suscriptor, Interes>());
		this.setSuscriptores(new ArrayList<Suscriptor>());
	}

	private void setSuscriptores(ArrayList<Suscriptor> susc) {
		// TODO Auto-generated method stub
		this.suscriptores = susc;
		
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	public Map<Suscriptor, Interes> getSuscripciones() {
		return suscripciones;
	}

	public void setSuscripciones(Map<Suscriptor, Interes> suscripciones) {
		this.suscripciones = suscripciones;
	}
	
	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
		this.notificar(partido);
	}

	private void notificar(Partido partido) {
		// TODO Auto-generated method stub
		
		for (Entry<Suscriptor, Interes> suscripcion : this.getSuscripciones().entrySet()) {
			//re leer funcionamiento de entrySet
			
			if(suscripcion.getValue().verificarInteres(partido)) {
				suscripcion.getKey().recibirPartido(partido);
			}
			
			
		}
	}

	public void agregarSuscripcion(Map<Suscriptor, Interes> suscripcion) {
		// TODO Auto-generated method stub
		this.getSuscripciones().;
	}
	
	

}
