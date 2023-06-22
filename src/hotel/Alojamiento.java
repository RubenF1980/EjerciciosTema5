package hotel;

public class Alojamiento {
//	Diseñar una aplicación que permita EMITIR FACTURAS de hotel.
//	Crearemos una superclase llamada Alojamiento con los siguientes atributos:
//	· número de habitación
//	· nombre del cliente al que se asignara · número de días de estancia
//	· tipo habitación:
//	• Individual: una habitación asignada a una persona. Puede tener una o más camas. (60€)
//	• Doble: una habitación asignada a dos personas. Puede tener una o más camas. (90€)
//	• Triple: una habitación asignada a tres personas. Puede tener dos o más camas. (110€)
//	• Quad: una sala asignada a cuatro personas. Puede tener dos o más camas. (120€)
//	POO: diseñar las clases necesarias y desarrollarlas en JAVA POO, indicando para cada una de las clases todos los atributos y 
//	los métodos más relevantes que	permitan gestionar el hotel. Utilizar estructuras de datos estáticas, arrays.
//	La gestión de un hotel deberá permitir la emisión de la correspondiente factura.
//	Al final la factura tendrá que visualizar la siguiente la información sobre cada uno de los alojamientos, por ejemplo:
//		HOTEL
//		Numero habitación: 4
//		Tipo habitación: Triple
//		Cliente: José Álvarez
//		Num. Días: 2
//		Precio Hab/día: 110€
//		El importe de la factura es: 220€

	private int numHabitacion;
	private String nombreCli;
	private int numDiasEstan;
	private int tipoHab;
	
	public int getNumHabitacion() {
		return numHabitacion;
	}
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}
	public String getNombreCli() {
		return nombreCli;
	}
	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}
	public int getNumDiasEstan() {
		return numDiasEstan;
	}
	public void setNumDiasEstan(int numDiasEstan) {
		this.numDiasEstan = numDiasEstan;
	}
	public Integer getTipoHab() {
		return tipoHab;
	}
	public void setTipoHab(int tipoHab) {
		this.tipoHab = tipoHab;
	}
//	@Override
//	public String toString() {
//		return "Alojamiento [numHabitacion=" + numHabitacion + ", nombreCli=" + nombreCli + ", numDiasEstan="
//				+ numDiasEstan + ", tipoHab=" + tipoHab + "]";
//	}
	public Alojamiento(int numHabitacion, String nombreCli, int numDiasEstan, int tipoHab) {
		super();
		this.numHabitacion = numHabitacion;
		this.nombreCli = nombreCli;
		this.numDiasEstan = numDiasEstan;
		this.tipoHab = tipoHab;
	}
	public Alojamiento() {
		super();
	}

	

}
