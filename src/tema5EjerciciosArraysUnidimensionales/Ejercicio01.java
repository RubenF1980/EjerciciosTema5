package tema5EjerciciosArraysUnidimensionales;

import java.util.Iterator;

public class Ejercicio01 {

//	Hacer un programa en Java que cargue el siguiente array {5, 4, 3, 7, 9, 12, 34, 56},
//	escriba la suma de los elementos situados en índice con valor par y la suma de los
//	elementos situados en índice con valor impar. Realizar para ello dos métodos: uno 
//	que se encargue del cálculo de la suma de los elementos de índice par y otro que se
//	encargue de la suma de los elementos de índice impar.
//	Visualizar los resultados en el método main.
	// Suma pares =51
	// Suma impares = 79

	public static int sumapar(int n[]) {
		int suma = 0;
		for (int i = 0; i < n.length; i += 2) {
			suma += n[i];
		}
		return suma;
	}

	public static int sumaimpar(int n[]) {
		int suma = 0;
		for (int i = 1; i < n.length; i += 2) {
			suma += n[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arraynum = { 5, 4, 3, 7, 9, 12, 34, 56 };
		for (int i = 0; i < arraynum.length; i++) {
			System.out.print(arraynum[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Suma pares " + sumapar(arraynum));
		System.out.println("Suma impares " + sumaimpar(arraynum));
	}

}
