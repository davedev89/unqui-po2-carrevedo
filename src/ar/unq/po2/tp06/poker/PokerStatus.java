package ar.unq.po2.tp06.poker;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerStatus {

	public PokerStatus() {
		// TODO Auto-generated constructor stub
	}

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> cartas = List.of(carta1, carta2, carta3, carta4, carta5);
		String resultado = "";
		
		if (this.esPoker(cartas)) {
			resultado = "Poker";
		} else if (this.esTrio(cartas)) {
			resultado = "Trío";
		} else if (this.esColor(cartas)) {
			resultado = "Color";
		}

		return resultado;
	}
	
	private Boolean esPoker(List<Carta> cartas) {
		Map<Integer, Long> cantidadPorValor = this.cantidadCartasPorValor(cartas);
		return Collections.max(cantidadPorValor.values()) == 4; 
	}
	
	private Boolean esTrio(List<Carta> cartas) {
		Map<Integer, Long> cantidadPorValor = this.cantidadCartasPorValor(cartas);
		return Collections.max(cantidadPorValor.values()) == 3;
	}
	
	private Boolean esColor(List<Carta> cartas) {
		Map<String, Long> cantidadPorPalo = this.cantidadCartasPorPalo(cartas);		
		return Collections.max(cantidadPorPalo.values()) == 5;
	}
	
	private Map<Integer, Long> cantidadCartasPorValor(List<Carta> cartas) {
		return cartas.stream()
				.collect(Collectors.groupingBy(Carta::getValor, Collectors.counting()));
	}
	
	private Map<String, Long> cantidadCartasPorPalo(List<Carta> cartas) {
		return cartas.stream()
				.collect(Collectors.groupingBy(Carta::getPalo, Collectors.counting()));
	}

}




