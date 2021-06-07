package ar.unq.po2.tp07.eventosdeportivos;

import java.util.List;

public class EventoDeportivo {
	
	private String deporte;
	private List<String> contrincantes;
	private String resultado;

	public EventoDeportivo(String deporte, List<String> contrincantes, String resultado) {
		this.setDeporte(deporte);
		this.setContrincantes(contrincantes);
		this.setResultado(resultado);
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public void setContrincantes(List<String> contrincantes) {
		this.contrincantes = contrincantes;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}