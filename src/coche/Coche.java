package coche;

public class Coche {
	
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
