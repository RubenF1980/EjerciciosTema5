package tema5EjerciciosArraysUnidimensionales;

import java.util.Scanner;

//Hacer un programa en Java que permita cargar dos arrays de 5 elementos cada uno y visualizarlos.
//Para ello crear un método que permita “rellenarlos” y otro que nos permita mostrar su contenido.

public class Ejercicio2 {

	public static void rellena(int array[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Intoduce numero para pos "+ (i+1) );
			array[i] = teclado.nextInt();
		}
	}

	public static void muestraarray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arraynum1 = new int[5];
		int[] arraynum2 = new int[5];
		rellena(arraynum1);
		muestraarray(arraynum1);
		rellena(arraynum2);
		muestraarray(arraynum2);
	}

}
