package ar.unq.po2.tp07.encuentrosDeportivos;

import java.util.ArrayList;

public class InteresContrincante implements Interes {
	
	private ArrayList <String> contrincantes;
	
	

	public InteresContrincante(ArrayList<String> contrincantes) {
		super();
		this.contrincantes = contrincantes;
	}

	
	public ArrayList<String> getContrincantes() {
		return contrincantes;
	}


	public void setContrincantes(ArrayList<String> contrincantes) {
		this.contrincantes = contrincantes;
	}


	@Override
	public boolean verificarInteres(Partido partido) {
		// TODO Auto-generated method stub
		
		ArrayList<String> contrincantesInteresantes = new ArrayList<String>(this.getContrincantes());
		return contrincantesInteresantes.retainAll(partido.getContrincantes());
		
		//ANOTACION: retainAll, retiene los elementos comunes.
		//Creo una lista en el mismo metodo, donde guardo todos los contrincantes, y luego 'filtro' los 
		//coincidentes con los que trae partido.
	}

}
