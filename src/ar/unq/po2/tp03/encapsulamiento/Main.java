package ar.unq.po2.tp03.encapsulamiento;



public class Main {
	
	public static void main(String args[]) {
		
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("EQUIPO");
		
		Persona p1 = new Persona("1",new Date(25,4,1989));
		Persona p2 = new Persona("2",new Date(30,3,1990));
		Persona p3 = new Persona("3",new Date(24,2,1994));
		Persona p4 = new Persona("4",new Date(15,1,2018));
		Persona p5 = new Persona("5",new Date(20,6,2000));
		
		equipo.addIntegrante(p1);
		equipo.addIntegrante(p2);
		equipo.addIntegrante(p3);
		equipo.addIntegrante(p4);
		equipo.addIntegrante(p5);
		
		System.out.println("Promedio de edades: " + equipo.promedioEdades());
	}

}
