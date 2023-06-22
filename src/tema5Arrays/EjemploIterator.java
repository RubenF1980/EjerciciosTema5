package tema5Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIterator {

	public static void main(String[] args) {
		/*
		 * En el siguiente ejemplo, donde queremos evaluar y mostrar el String que se
		 * analiza, utilizamos otro String temporal para almacenar el que nos devuelve
		 * cada llamada al método next().
		 */
		ArrayList<String> listaDeNombres = new ArrayList<String>();
		listaDeNombres.add("Ruben de la Fuente");
		listaDeNombres.add("Celia Costales Gonzalez");
		listaDeNombres.add("Kotokenya mochimaimo ");
		String cadenaBusca = "Ruben";
		System.out.println("La cadena que buscamos es " + cadenaBusca);

		Iterator<String> it = listaDeNombres.iterator(); // Creamos el objeto it de tipo Iterator con String
		String tmpAnlizando;
		while (it.hasNext()) {
			tmpAnlizando = it.next();// Uti1izamos_ el método hasNext de objetos tipo Iterator
			System.out.println("Analizando elemento " + tmpAnlizando);// Utilizamos el métodp next de objetos tipo Iterator
			if (tmpAnlizando.contains(cadenaBusca)) {
				System.out.println("Cadena Encontrada " + tmpAnlizando);
			} else {
				System.out.println("Cadena no Encontrada ");
			} //

		} // while
	}// main
}// clase
