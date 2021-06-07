package ar.unq.po2.tp07.publicaciones;

import java.util.List;

public class Articulo {
	
	private String titulo;
	private List<String> autores;
	private List<String> filiaciones;
	private String tipo;
	private String lugarPublicacion;
	private List<String> palabrasClave;
	
	public Articulo(String titulo, List<String> autores) {
		this.setTitulo(titulo);
		this.setAutores(autores);
	}
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public List<String> getAutores() {
		return autores;
	}


	public void setAutores(List<String> autores) {
		this.autores = autores;
	}


	public List<String> getFiliaciones() {
		return filiaciones;
	}


	public void setFiliaciones(List<String> filiaciones) {
		this.filiaciones = filiaciones;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getLugarPublicacion() {
		return lugarPublicacion;
	}


	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}


	public List<String> getPalabrasClave() {
		return palabrasClave;
	}


	public void setPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

}