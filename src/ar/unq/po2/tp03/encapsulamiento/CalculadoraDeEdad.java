package ar.unq.po2.tp03.encapsulamiento;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculadoraDeEdad {
	
	public double calcularEdad(Date fecha) {
			
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			SimpleDateFormat x =  new SimpleDateFormat("E dd/MM/yyyy");
			LocalDate fechaNac = LocalDate.parse(x.format(fecha), fmt);
			LocalDate ahora = LocalDate.now();		 
			Period periodo = Period.between(fechaNac, ahora);
			return periodo.getYears();
			
		}

}
