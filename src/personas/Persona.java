package personas;

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
	
	
}
