package biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private String ISBN;
	private boolean prestado;
	private int numedicion;
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prestado=" + prestado
				+ ", numedicion=" + numedicion + "]";
	}
	public Libro(String titulo, String autor, String iSBN, int numedicion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		prestado= false;
		this.numedicion = numedicion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public int getNumedicion() {
		return numedicion;
	}
	public void setNumedicion(int numedicion) {
		this.numedicion = numedicion;
	}

	
	
	
	

}
