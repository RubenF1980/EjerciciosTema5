package tema5Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorVSforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaDeNombres = new ArrayList<String>();
		
		listaDeNombres.add("Olga");
		listaDeNombres.add("Miguel");
		listaDeNombres.add("Antonio");
		listaDeNombres.add("Pedro");

		// defino el iterador que es un objeto que nos permite recorrer una lista para
		// mostrar y con el hasnext y el itnext
		System.out.println("Nombres con iterator ");
		Iterator<String> it = listaDeNombres.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// lo hago con foreach
		System.out.println("Nombres con foreach ");
		for (String nombres : listaDeNombres) {
			System.out.println(nombres);
		}
		// Vamos a borrar todas las personas que se llaman "Pedro" de la lista con un
		// bucle foreach:
		// El código no funciona y lanza una excepción, ya que estamos recorriendo y
		// modificando la lista ala vez
		// for (String nombre : listaDeNombres) {
		// if (nombre.equals("Pedro")) {
		// listaDeNombres.remove("Pedro");
		// }
		// }
		System.out.println("\n Aqui salto para borrar ");
		// Iterator dispone de un método que permite eliminar objetos de una lista
		// mientras la recorremos (el método remove)		
		
		Iterator<String> it2 = listaDeNombres.iterator();
		while (it2.hasNext()) {
			String nombre = it2.next();
			if (nombre.equals("Antonio")) {
				it2.remove();
			}
			System.out.println(it2.next());
		}

	}// main

}
