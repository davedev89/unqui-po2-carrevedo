package ar.unq.po2.tp07.publicaciones;

import java.util.ArrayList;

public class Articulo {
	
	String titulo;
	ArrayList <String> autores;
	ArrayList <String> filiaciones;
	String tipoTexto;
	String lugarPub;
	ArrayList <String> keywords;
	
	
	public Articulo(String titulo, ArrayList <String>autores, ArrayList <String>filiaciones, String tipoTexto, String lugarPub,
			ArrayList<String> keywords) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipoTexto = tipoTexto;
		this.lugarPub = lugarPub;
		this.keywords = keywords;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList <String>getAutores() {
		return autores;
	}

	public void setAutores(ArrayList <String>autores) {
		this.autores = autores;
	}

	public ArrayList <String>getFiliaciones() {
		return filiaciones;
	}

	public void setFiliaciones(ArrayList <String>filiaciones) {
		this.filiaciones = filiaciones;
	}

	public String getTipoTexto() {
		return tipoTexto;
	}

	public void setTipoTexto(String tipoTexto) {
		this.tipoTexto = tipoTexto;
	}

	public String getLugarPub() {
		return lugarPub;
	}

	public void setLugarPub(String lugarPub) {
		this.lugarPub = lugarPub;
	}

	public ArrayList <String>getKeywords() {
		return keywords;
	}

	public void setKeywords(ArrayList <String>keywords) {
		this.keywords = keywords;
	}
	
	public ArrayList<String> getTemas() {
		ArrayList<String> temas = this.keywords;
		temas.add(tipoTexto);
		temas.add(lugarPub);
		temas.addAll(filiaciones);
		return temas;
	}


}
