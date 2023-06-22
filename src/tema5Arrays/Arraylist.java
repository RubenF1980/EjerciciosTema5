package tema5Arrays;

import java.util.ArrayList;

public class Arraylist {
	/*-add(elemento) Añade un elemento al final de la lista.
	-add(indice, elemento) Inserta un elemento en una posición determinada, desplazando el resto
	de elementos hacia la derecha.
	-clear() Elimina todos los elementos pero no borra la lista.
	-contains(elemento) Devuelve true si la lista contiene el elemento que se especifica y false
	en caso contrario.
	-get(indice) Devuelve el elemento de la posición que se indica entre paréntesis.
	-indexOf(elemento) Devuelve la posición de la primera ocurrencia del elemento que se
	indica entre paréntesis.
	-isEmpty() Devuelve true si la lista está vacía y false en caso de tener algún
	elemento.
	-remove(indice) Elimina el elemento que se encuentra en una posición determinada.
	-remove(elemento) Elimina la primera ocurrencia de un elemento.
	-removeIf(filtro) Elimina los elementos que cumplen una determinada condición.
	-set(indice, elemento) Machaca el elemento que se encuentra en una determinada posición
	con el elemento que se pasa como parámetro.
	-size() Devuelve el tamaño (número de elementos) de la lista.
	-toArray() Devuelve un array con todos y cada uno de los elementos que contiene
	la lista.*/

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		System.out.println("La posicion 2 es " + numeros.get(2));
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println("La posiscion " + i + "es " + numeros.get(i));
			
		}

	}

}
