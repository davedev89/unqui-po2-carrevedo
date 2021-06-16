package ar.unq.po2.tp07.encuentrosDeportivos;

import java.util.ArrayList;

public class InteresCompuesto implements Interes {
	
	private ArrayList <Interes> intereses;
		

	public InteresCompuesto(ArrayList<Interes> intereses) {
		super();
		this.intereses = intereses;
	}


	public ArrayList<Interes> getIntereses() {
		return intereses;
	}


	public void setIntereses(ArrayList<Interes> intereses) {
		this.intereses = intereses;
	}
	
	public void agregarInteres(Interes interes) {
		this.getIntereses().add(interes);
	}


	@Override
	public boolean verificarInteres(Partido partido) {
		// TODO Auto-generated method stub
		return this.getIntereses().stream().anyMatch(c -> c.verificarInteres(partido));
	}

}
