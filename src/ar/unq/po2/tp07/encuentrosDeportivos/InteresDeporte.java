package ar.unq.po2.tp07.encuentrosDeportivos;

import java.util.ArrayList;

public class InteresDeporte implements Interes {
	
	private ArrayList <String> deportes;
	
	public InteresDeporte(ArrayList<String> deportes) {
		super();
		this.deportes = deportes;
	}
	
	public ArrayList<String> getDeportes() {
		return deportes;
	}

	public void setDeportes(ArrayList<String> deportes) {
		this.deportes = deportes;
	}

	@Override
	public boolean verificarInteres(Partido partido) {
		// TODO Auto-generated method stub
		
		return this.getDeportes().contains(partido.getDeporte());
	}

}
