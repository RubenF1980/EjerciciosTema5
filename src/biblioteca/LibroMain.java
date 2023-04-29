package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class LibroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// Construyo el array list
		ArrayList<Libro> biblioteca = new ArrayList<>();
		boolean salir = false;

		while (salir == false) {

			System.out.println("1. Introducir nuevo libro");
			System.out.println("2. Prestar un libro");
			System.out.println("3. Devolver un libro prestado");
			System.out.println("4. Mostrar todos los libros");
			System.out.println("5. Buscar un libro por ISBN");
			System.out.println("6. Buscar libros de un autor");
			System.out.println("7. Salir");

			System.out.println("Escribe una de las opciones");
			int opcion = teclado.nextInt();
			// Limpio el teclado
			teclado.nextLine();

			switch (opcion) {
			case 1:
				// Introducir nuevo libro
				System.out.println("Introduce el titulo");
				String titulo = teclado.nextLine();
				System.out.println("Introduce el autor");
				String autor = teclado.nextLine();
				System.out.println("Introduce el ISBN");
				String ISBN = teclado.nextLine();
				System.out.println("Introduce el num de edicion ");
				int numedicion = teclado.nextInt();
				biblioteca.add(new Libro(titulo, autor, ISBN, numedicion));
				break;
			case 2:
				// Prestar un nuevo libro
				System.out.println("Introduce titulo del libro");
				String libroaprestar = teclado.nextLine();
				boolean prestamo = false;
				for (Libro libro : biblioteca) {
					if (libroaprestar.equals(libro.getTitulo()) && !libro.isPrestado()) {
						libro.setPrestado(true);
						prestamo = true;
					}
				} // for
				if (prestamo) {
					System.out.println("Prestado con exito");
				} else {
					System.out.println("No se pudo prestar.Ya esta cojido ");
				}
				break;

			case 3:
				// Devolver un libro
				System.out.println("Introduce titulo del libro");
				String libroaDevolver = teclado.nextLine();
				boolean devolver = false;
				for (Libro libro : biblioteca) {
					if (libroaDevolver.equalsIgnoreCase(libro.getTitulo()) && libro.isPrestado()) {
						libro.setPrestado(false);
						devolver = true;
					}
				} // for
				if (devolver) {
					System.out.println("Libro devuelto con exito ");
				} else {
					System.out.println("El libro no estaba prestado.Mongol");
				}

				break;
			case 4:
				// Mostrar todos los libros
				for (Libro libro : biblioteca) {
					System.out.println(libro.toString());					
				}
				//Se puede de las dos 
				//System.out.println(biblioteca);
				break;

			case 5:
				//Buscar libro por isbn
				Boolean encontrado= false;
				System.out.println("Introduce ISBN para buscar ");
				String ISBNBuscar = teclado.nextLine();
				for (Libro libro : biblioteca) {
					if (ISBNBuscar.equalsIgnoreCase(libro.getISBN())) {
						System.out.println(libro.toString());
						encontrado= true;
					}
				}	
				if (!encontrado) {
					System.out.println("El libro no esta en la biblioteca");
				}
				break;
			case 6:
				//Buscar libros de un autor
				Boolean encontrado2= false;
				System.out.println("Introduce autor para buscar ");
				String autorBuscar = teclado.nextLine();
				for (int i = 0; i < biblioteca.size(); i++) {
					if (biblioteca.get(i).getAutor().equalsIgnoreCase(autorBuscar)) {
						System.out.println(biblioteca.get(i).toString());
						encontrado= true;						
					}
				}//for
				if (!encontrado2) {
					System.out.println("No hay libros de ese autor en la biblioteca");
				}
				break;

			case 7:
				salir = true;
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opcion incorrecta");
			}

		}

	}

}
