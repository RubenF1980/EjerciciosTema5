package personas_arraylist;

public class Persona {

	private String apellido;
	private String nombreString;
	private int fechaNacimiento;
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombreString() {
		return nombreString;
	}
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}
	public int getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Persona(String apellido, String nombreString, int fechaNacimiento) {
		super();
		this.apellido = apellido;
		this.nombreString = nombreString;
		this.fechaNacimiento = fechaNacimiento;
	}
//	Crear los siguientes datos de la clase persona:
//		Persona("Wayne", "John",1907)
//		Persona("McQueen", "Steve",1930)
//		Persona("Lennon", "John",1940)
//		Persona("Gibson", "Mel",1956)
//		Persona("Willis", "Bruce",1955)
//		Crea el siguiente menú en la clase ejecutable, que permita trabajar sobre un ArrayList de personas. Utilizar métodos.
//		***** MENU ******
//		1.- Añadir
//		2.- Borrar (por apellido)
//		3.- Modificar (por apellido)
//		4.- Visualizar (todas las personas)
//		5.- Buscar (por apellido) 6.- SALIR
//		Elegir opción:
	
	
}
