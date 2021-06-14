package ar.unq.po2.tp07.publicaciones;

import java.util.ArrayList;

public class Investigador implements ISuscripcion {
	
	ArrayList <String> intereses;

	public Investigador(ArrayList<String> intereses) {
		super();
		this.intereses = intereses;
	}

	public ArrayList<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(ArrayList<String> intereses) {
		this.intereses = intereses;
	}
	
	

	@Override
	public void update(Articulo articulo) {
		// TODO Auto-generated method stub
	
		System.out.println("Se ha publicado el articulo "+articulo.getTitulo());
	}
	
	

}
