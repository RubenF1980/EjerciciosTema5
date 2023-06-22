package personas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonasMain {

	public static void main(String[] args) {

		// Construllo el array list
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Scanner teclado = new Scanner(System.in);

		// Creo las personas
		Persona p1, p2, p3, p4, p5;

		// agrego las personas .Si lo ahgo sin el add despues tengo que hacer el add
		p1 = new Persona("Wayne", "John", 1907);
		listaPersonas.add(p1);
		// Las puedo añadir asi
		// listaPersonas.add(new Persona("Wayne","John",1907));
		listaPersonas.add(new Persona("McQueen", "Steve", 1930));
		listaPersonas.add(new Persona("Lennon", "John", 1940));
		listaPersonas.add(new Persona("Gibson", "Mel", 1956));
		listaPersonas.add(new Persona("Willis", "Bruce", 1955));

		// mostrar(listaPersonas);
		int respuesta = 0;
		do {
			System.out.println();
			System.out.println("***** MENU ******");
			System.out.println("1.- A�adir");
			System.out.println("2.- Borrar");
			System.out.println("3.- Modificar");
			System.out.println("4.- Visualizar");
			System.out.println("5.- Buscar");
			System.out.println("6.- SALIR");
			System.out.print("Elegir opcion: ");
			respuesta = teclado.nextInt();

			if (respuesta == 1) {
				introducir(listaPersonas);
			}
			if (respuesta == 2) {
				borrar(listaPersonas);
			}
			if (respuesta == 3) {
				modificar(listaPersonas);
			}
			if (respuesta == 4) {
				mostrar(listaPersonas);
			}
			if (respuesta == 5) {
				buscar(listaPersonas);
			}

		} while (respuesta != 6);
		System.out.println("***Fin****");
		teclado.close();
	}

	public static void introducir(ArrayList<Persona> lista) {
		Scanner teclado = new Scanner(System.in);
		String respuestaString = "si";
		while (respuestaString.equalsIgnoreCase("si")) {
			System.out.println("Introduce el apellido de la  persona  a añadir");
			String apellido = teclado.next();
			System.out.println("Introduce el nombre de la  persona  a añadir");
			String nombre = teclado.next();
			System.out.println("Introduce el año de nacimiento de la  persona  a añadir");
			int fecha = teclado.nextInt();
			// Puedo de dos formas
			// Creando una nueva persona y agregandola
			Persona per = new Persona(apellido, nombre, fecha);
			lista.add(per);
			// O hacer todo junto
//			lista.add(new Persona(apellido, nombre, fecha));
			System.out.println("Introducir mas personas . si/no");
			respuestaString = teclado.next();
		}

	}

	public static void borrar(ArrayList<Persona> lista) {
		Scanner teclado = new Scanner(System.in);
		boolean sw = false;
		String nombreString;
		System.out.println("Introduce el apellido a eliminar");
		nombreString = teclado.next();
		// Cuando recorro un array list se recorre con el .size
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getApellido().equalsIgnoreCase(nombreString)) {
				lista.remove(i);
				sw = true;
			}
		}
		if (sw == false) {
			System.out.println("El apellido no esta en la lista ");
		}
		// No cerrar nunca los teclados en los metodos.Da error

	}

	public static void modificar(ArrayList<Persona> lista) {
		Scanner teclado = new Scanner(System.in);
		boolean control = false;
		String respuestaString = "si";

		while (respuestaString.equalsIgnoreCase("si")) {
			System.out.println("Introduce el apellido de la  persona  a modificar");
			String apellidores = teclado.next();
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getApellido().equalsIgnoreCase(apellidores)) {
					System.out.println("Introduce el nuevo apellido ");
					String apellido = teclado.next();
					System.out.println("Introduce el nuevo nombre ");
					String nombre = teclado.next();
					System.out.println("Introduce el nuevo año de nacimiento ");
					int fecha = teclado.nextInt();
					Persona persona = new Persona(apellido, nombre, fecha);
					lista.set(i, persona);
					control = true;
				}
			} // for
			if (control == false) {
				System.out.println("Esa persona no esta en la lista ");

			}
			System.out.println("Modificar mas personas . si/no");
			respuestaString = teclado.next();
		} // while
	}

	public static void mostrar(ArrayList<Persona> lista) {
		for (Persona persona : lista) {
			System.out.print(persona.getApellido() + " ");
			System.out.print(persona.getNombreString() + " ");
			System.out.println(persona.getFechaNacimiento() + " ");
		}

	}

	private static void buscar(ArrayList<Persona> listaPersonas) {
		Scanner teclado = new Scanner(System.in);
		boolean control= false;
		System.out.println("Introduce el apellido de la  persona  a buscar");
		String apellido = teclado.next();
		for (Persona persona : listaPersonas) {
			if (persona.getApellido().equalsIgnoreCase(apellido)) {
				System.out.println("La persona esta ");
				control= true;
			} 		
		}
		if (control== false) {
			System.out.println("La persona no esta ");
			
		}
	}

	
	
	
	
}
