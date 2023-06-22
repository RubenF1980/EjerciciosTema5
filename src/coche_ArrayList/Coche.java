package coche_ArrayList;

public class Coche {
//	Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche.
//	El programa guarda los datos de los coches de la imagen y los guarda en el ArrayList.
//	A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
//		- Todos los coches introducidos.
//		- Todos los coches de una marca determinada.
//		- Todos los coches con menos de un número determinado de Kilómetros.
//		- El coche con mayor número de Kilómetros.
//		- Todos los coches ordenados por número de kilómetros de menor a mayor.
//		- Añadir coches.
//		//Clase Coche private String matricula; private String marca; private String modelo; private int Km;
	
	private String matricula;
	private String marca;
	private String modelo;
	private Integer Km;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getKm() {
		return Km;
	}
	public void setKm(int km) {
		Km = km;
	}
	@Override
	public String toString() {
		return "\nCoche [\nmatricula=" + matricula + ", \nmarca=" + marca + ", \nmodelo=" + modelo + ", \nKm=" + Km + "]";
	}
	public Coche(String matricula, String marca, String modelo, int km) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		Km = km;
	}
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
