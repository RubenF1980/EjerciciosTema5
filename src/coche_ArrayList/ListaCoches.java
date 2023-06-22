package coche_ArrayList;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class ListaCoches {

//	ArrayList<Coche> coches = new ArrayList<Coche>();
	
///Se puede hacer de l	s dos formas 
	
	 ArrayList<Coche> coches;
	 
	public ListaCoches() {
		coches = new ArrayList<Coche>();
	}

	public void leerCoches() {
		Coche c1, c2, c3, c4;
		c1 = new Coche("9876GKM", "RENAULT", "MEGANE", 0);
		c2 = new Coche("1685BGT", "AUDI", "A3", 18000);
		c3 = new Coche("2709CXF", "AUDI", "A4", 5000);
		c4 = new Coche("1234BBB", "AUDI", "A3", 44500);
		coches.add(c1);
		coches.add(c2);
		coches.add(c3);
		coches.add(c4);

	}

	public void mostrarCoches() {
		for (int i = 0; i < coches.size(); i++) {
			System.out.println(coches.get(i));
		}
	}

	public void mostrarCoches2() {
		for (Coche auxCoche : coches) {
			System.out.println(auxCoche.toString());
		}
	}

	public void mostrarPorMarca(String marca) {
		boolean res = false;
		System.out.println("Coches de la marca " + marca);
		for (Coche auxcoche : coches) {
			if (auxcoche.getMarca().equalsIgnoreCase(marca)) {
				System.out.println("El coche de la marca " + auxcoche.getMarca() + " esta con la matricula"
						+ auxcoche.getMatricula());
				res = true;
			}
		}
		if (res == false) {
			System.out.println("Esa marca no esta ");
		}
	}

	public void mostraconxkm(Integer km) {

		for (Coche auxcoche : coches) {
			if (auxcoche.getKm() < km) {
				System.out.println("Este " + auxcoche.getMarca() + " con matricula " + auxcoche.getMatricula()
						+ " tiene " + auxcoche.getKm());
			}
		}
	}

	public Coche CocheMaskm() {
		Coche mayorCoche = null;
		int mayor = -1;
		for (Coche auxcoche : coches) {
			if (auxcoche.getKm() > mayor) {
				mayor = auxcoche.getKm();
				mayorCoche = auxcoche;

			}
		}
		return mayorCoche;

	}

	public void ordenarCoches() {

		Collections.sort(coches, new Comparator<Coche>() {

			@Override
			public int compare(Coche o1, Coche o2) {
				return o1.getKm().compareTo(o2.getKm());
			}

		});
	}

	public void addcoches() {

		Scanner teclado = new Scanner(System.in);
		// declaracion de variables para leer los datos
		String matricula;
		String marca;
		String modelo;
		int km;
		// Variable auxiliar que contendr� la referencia a cada coche nuevo.
		Coche auxCoche;

		// lectura de los coches.Hacemos un while para si queremos mas de uno
		String res = "Si";
		while (res.equalsIgnoreCase("SI")) {
			System.out.println("Introduce la matricula");
			matricula = teclado.nextLine();
			System.out.println("Introduce la marca");
			marca = teclado.nextLine();
			System.out.println("Introduce el modelo");
			modelo = teclado.nextLine();
			System.out.println("Introduce los km");
			km = teclado.nextInt();
			// Limpiamos el intro
			teclado.nextLine();
			// Creo un nuevo coche
			auxCoche = new Coche();
			// seteo los valores
			auxCoche.setMatricula(matricula);
			auxCoche.setModelo(modelo);
			auxCoche.setMarca(marca);
			auxCoche.setKm(km);

			// añado el objeto al final dela arraylist de coches
			coches.add(auxCoche);
			System.out.println("Pon si para añadir mas coches ");
			res = teclado.nextLine();
		}
	}// fin del metodo leer coches

	public void borrarCoche(String marca) {
		// Creamos un iterador sobre la lista
		Iterator<Coche> iterador = coches.iterator();

		// utilizamos el hasnext para comprobar si hay mas elementos a continuacion

		while (iterador.hasNext()) {
			// Coche uncoche = (Coche) iterador.next();
			// Se puede asi tambien
			Coche uncoche = iterador.next();
			if (uncoche.getMarca().equalsIgnoreCase(marca)) {
				iterador.remove();
			}
		}

	}

}