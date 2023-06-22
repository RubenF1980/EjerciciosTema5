package tema5Arrays;

import java.util.ArrayList;



public class ArrayListSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("verde");
		a.add("rojo");
		a.add("amarillo");
		a.add("blanco");

		System.out.println("Contenido de la lista sin tocar : ");
		for (String color : a)
			System.out.println(color);

		System.out.println("Contenido de la lista tras machacar la posicion 0 del array con azul.");
		a.set(0, "azul");
		for (String color : a) {
			System.out.println(color);
		}

		if (a.contains("blanco")) {
			System.out.println("El blanco esta en Ia lista de colores");
		}

		System.out.println("Contenido de la lista tras borrar el blanco ");
		a.remove("blanco");
		for (String color : a) {
			System.out.println(color);
		}

		System.out.println("Contenido de la lista tras borrar el color de la posicion 3 del array ");
		a.remove(2);
		for (String color : a) {
			System.out.println(color);
		}

		// reestuctura el solo el array list al agregar
		System.out.println("Contenido de la lista tras añadir otro color en la posicion 1");
		a.add(1, "turquesa");
		for (String color : a) {
			System.out.println(color);
		}

		// borrado selectivo de la palabras que tengan a.
		System.out.println("Contenido de la lista tras borrar el color si contiene la a");
		a.removeIf(palabra -> palabra.contains("a"));
		for (String color : a) {
			System.out.println(color);
		}
	}
}
