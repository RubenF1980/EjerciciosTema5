package tema5EjerciciosArraysUnidimensionales.Ejercicio10Mio;

public class ClassEmpleado {

	//Primero le doy los atributos
	private String nombre;
	private int edad ;
	private double sueldo;	
	//Genero el tostring 
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	//genero el constructor
	public ClassEmpleado(String nombre, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	
	
	

}
