package ar.unq.po2.tp07.publicaciones;

public class Investigador implements Suscriptor {
	
	private Sistema sistema;
	private Criterio criterio;

	public Investigador(Sistema sistema, Criterio criterio) {
		this.setSistema(sistema);
		this.setCriterio(criterio);
		this.getSistema().suscribir(this, criterio);
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public void actualizar(Articulo articulo) {
		// Guardar y/o leer el artículo
	}

}