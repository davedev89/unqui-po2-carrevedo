package ar.unq.po2.tp05.bancosYPrestamos;

public class Cliente {
	
	String nombre;
	String apellido;
	String direccion;
	int edad;
	double sueldoNetoMensual;
	double sueldoNetoAnual;
	
	public Cliente (String name, String surname, String address, int ages, double monthlySalary) {
		this.nombre = name;
		this.apellido = surname;
		this.direccion = address;
		this.edad = ages;
		this.sueldoNetoMensual = monthlySalary;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getSueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}

		

}
