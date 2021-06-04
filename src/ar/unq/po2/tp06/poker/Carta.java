package ar.unq.po2.tp06.poker;

public class Carta {
	
	private String palo;
	private Integer valor;

	public Carta(String palo, Integer valor) {
		this.setPalo(palo);
		this.setValor(valor);
	}

	public String getPalo() {
		return palo;
	}

	private void setPalo(String palo) {
		this.palo = palo;
	}

	public Integer getValor() {
		return valor;
	}
	
	private void setValor(Integer valor) {
		this.valor = valor;
	}

	public Boolean mismoPalo(Carta otraCarta) {
		return this.getPalo() == otraCarta.getPalo();
	}
	
	public Boolean esDeMayorValor(Carta otraCarta) {
		return this.getValor() > otraCarta.getValor();
	}	
	
}


