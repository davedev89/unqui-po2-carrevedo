package ar.unq.po2.tp07.encuentrosDeportivos;

import java.util.ArrayList;

public class Partido {
	
	private String resultado;
	private ArrayList <String> contrincantes;  
	private String deporte;
	
	
	public Partido(String resultado, ArrayList <String>contrincantes, String deporte) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public ArrayList <String>getContrincantes() {
		return contrincantes;
	}
	public void setContrincantes(ArrayList <String>contrincantes) {
		this.contrincantes = contrincantes;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	

}
