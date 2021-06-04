package ar.unq.po2.tp06.poker;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp06.poker.Carta;
import ar.unq.po2.tp06.poker.PokerStatus;

class PokerStatusTest {

	PokerStatus status;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		this.status = new PokerStatus();
	}

	@Test
	void testCuatroCartasMismoValorUnaDiferenteEsPoker() {
		// setup
		this.carta1 = new Carta("P", 1);
		this.carta2 = new Carta("C", 1);
		this.carta3 = new Carta("D", 1);
		this.carta4 = new Carta("T", 1);
		this.carta5 = new Carta("C", 2);

		// exercise
		String resultado = this.status.verificar(this.carta1, this.carta2, this.carta3, this.carta4, this.carta5);

		// verify
		assertEquals("Poker", resultado);

		// teardown
	}

	@Test
	void testTodasCartasMismoPaloEsColor() {
		// setup
		this.carta1 = new Carta("P", 1);
		this.carta2 = new Carta("P", 2);
		this.carta3 = new Carta("P", 3);
		this.carta4 = new Carta("P", 4);
		this.carta5 = new Carta("P", 5);

		// exercise
		String resultado = this.status.verificar(this.carta1, this.carta2, this.carta3, this.carta4, this.carta5);

		// verify
		assertEquals("Color", resultado);

		// teardown
	}

	@Test
	void testTresMismoValorDosDiferentesEsTrio() {
		// setup
		this.carta1 = new Carta("P", 1);
		this.carta2 = new Carta("C", 1);
		this.carta3 = new Carta("D", 1);
		this.carta4 = new Carta("T", 2);
		this.carta5 = new Carta("C", 3);

		// exercise
		String resultado = this.status.verificar(this.carta1, this.carta2, this.carta3, this.carta4, this.carta5);

		// verify
		assertEquals("Trío", resultado);

		// teardown
	}
	
	@Test
	void testTodasCartasDiferentes() {
		// setup
		this.carta1 = new Carta("P", 1);
		this.carta2 = new Carta("C", 2);
		this.carta3 = new Carta("D", 3);
		this.carta4 = new Carta("T", 4);
		this.carta5 = new Carta("C", 5);
		// exercise
		String resultado = this.status.verificar(this.carta1, this.carta2, this.carta3, this.carta4, this.carta5);

		// verify
		assertEquals("", resultado);

		// teardown
	}
	
	@Test
	void testDosCartasMismoValorOtrasDosMismoValorYUnaDiferente() {
		// setup
		this.carta1 = new Carta("P", 1);
		this.carta2 = new Carta("C", 1);
		this.carta3 = new Carta("D", 2);
		this.carta4 = new Carta("T", 2);
		this.carta5 = new Carta("C", 3);

		// exercise
		String resultado = this.status.verificar(this.carta1, this.carta2, this.carta3, this.carta4, this.carta5);

		// verify
		assertEquals("", resultado);

		// teardown 
	}

}