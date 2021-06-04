package ar.unq.po2.tp05.bancosYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tp05.bancosYPrestamos.Banco;
import ar.unq.po2.tp05.bancosYPrestamos.Cliente;
import ar.unq.po2.tp05.bancosYPrestamos.Propiedad;
import ar.unq.po2.tp05.bancosYPrestamos.SolicitudCreditoHipotecario;
import ar.unq.po2.tp05.bancosYPrestamos.SolicitudCreditoPersonal;

class BancoTest {
	
	Cliente  cliente1;
	Cliente cliente2;
	Banco unBanco;
	ArrayList <Cliente> clientes;
	SolicitudCreditoPersonal unaSolicitudPersonalAceptable;
	SolicitudCreditoPersonal unaSolicitudPersonalNoAceptable;
	SolicitudCreditoHipotecario unaSolicitudHipotecariaNoAceptable;
	Propiedad unaPropiedad;

	@BeforeEach
	void setUp() throws Exception {
		
		cliente1 = new Cliente ("Juan", "Perez", "calle 123", 20, 2000);
		cliente2 = new Cliente ("Pedro", "Gomez", "calle 333", 25, 2000);
		clientes = new ArrayList <Cliente>();
		unBanco = new Banco ();
		unaSolicitudPersonalAceptable = new SolicitudCreditoPersonal(cliente1, 100, 12);
		unaSolicitudPersonalNoAceptable = new SolicitudCreditoPersonal(cliente2, 500000, 12);
		unaSolicitudHipotecariaNoAceptable = new SolicitudCreditoHipotecario(cliente2, 10000, 24, unaPropiedad);
		unaPropiedad = new Propiedad("asd", 10000);
	}

	

	@Test
	void testAgregarClientes() {

		unBanco.agregarCliente(cliente1);
		unBanco.agregarCliente(cliente2);
		
		assertTrue(unBanco.getClientes().contains(cliente1));
		
	}
	
	@Test
	void testCalcularSueldoAnual() {
		
		assertEquals (cliente1.getSueldoNetoAnual(), 24000);
	}
	
	@Test
	void testSolicitarCreditoPersonal() {
		
		assertTrue(unBanco.getSolicitudes().isEmpty());
		
		unBanco.solicitarCreditoPersonal(cliente1, 100000, 12);
		
		assertFalse(unBanco.getSolicitudes().isEmpty());
	
	}
	
	
	@Test
	void testSolicitarCreditoHipotecario() {
		
		unBanco.solicitarCreditoHipotecario(cliente2, 50000, 12, "asd", 50000);
		assertEquals(unBanco.getSolicitudes().size(), 1);
	}
	
	
	@Test
	void testUnCreditoPersonalNoEsAceptable(){
		
		assertFalse(unaSolicitudPersonalNoAceptable.esAceptable());
		
	}
	
	@Test
	void testUnCreditoHipotecarioAceptable() {
		
		assertFalse(unaSolicitudHipotecariaNoAceptable.esAceptable());
		
	}
	
	@Test
	void testMontoADesembolsar() {
		unBanco.solicitarCreditoPersonal(cliente1, 2000, 12);
		unBanco.solicitarCreditoHipotecario(cliente2, 10000, 12, "asd", 10000);
		
		assertEquals(unBanco.getMontoADesembolsar() , 12000);
	}

}





















