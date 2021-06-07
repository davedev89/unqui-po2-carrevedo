package ar.unq.po2.tp07.eventosdeportivos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sistema {
	
	private List<EventoDeportivo> eventosDeportivos;
	private Map<Suscriptor, Aspecto> suscripciones;

	public Sistema() {
		this.setEventosDeportivos(new ArrayList<EventoDeportivo>());
		this.setSuscripciones(new HashMap<Suscriptor, Aspecto>());
	}

	public List<EventoDeportivo> getEventosDeportivos() {
		return eventosDeportivos;
	}

	private void setEventosDeportivos(List<EventoDeportivo> eventosDeportivos) {
		this.eventosDeportivos = eventosDeportivos;
	}

	public Map<Suscriptor, Aspecto> getSuscripciones() {
		return suscripciones;
	}

	private void setSuscripciones(Map<Suscriptor, Aspecto> suscripciones) {
		this.suscripciones = suscripciones;
	}
	
	public void agregarEventoDeportivo(EventoDeportivo eventoDeportivo) {
		this.getEventosDeportivos().add(eventoDeportivo);
		this.notificarSuscriptores(eventoDeportivo);
	}
	
	public void suscribir(Suscriptor suscriptor, Aspecto aspecto) {
		this.getSuscripciones().put(suscriptor, aspecto);
	}
	
	public void desuscribir(Suscriptor suscriptor) {
		this.getSuscripciones().remove(suscriptor);
	}
	
	private void notificarSuscriptores(EventoDeportivo eventoDeportivo) {
		for (Entry<Suscriptor, Aspecto> suscripcion : this.getSuscripciones().entrySet()) {
			if (suscripcion.getValue().verificar(eventoDeportivo)) {
				suscripcion.getKey().recibirEventoDeportivo(eventoDeportivo);
			}
		}
	}

}