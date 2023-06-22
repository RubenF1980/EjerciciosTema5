package tema5EjerciciosArraysUnidimensionales;

import java.util.Random;
import java.util.Scanner;

/*
Hacer un programa en Java que meta   números enteros aleatorios positivos en un vector de 10 elementos. 
Luego pida por teclado una posición y nos visualice el contenido de esa posición. 
Realizar el programa mediante métodos que resuelvan cada uno de los procesos. 
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		int[] vector1 = new int[10];
		char respuesta = ' ';
		int posicion;

		rellenarArray(vector1);
		visualizaarray(vector1);
		Scanner tecladoScanner = new Scanner(System.in);
		do {
			System.out.println("\nIntroduce posicion que quieres visualizar ");
			posicion = tecladoScanner.nextInt();
			while (posicion < 1 || posicion > 10) {
				System.out.println("Error.Introduce de 1 a 10 ");
				posicion = tecladoScanner.nextInt();
			}
			visualizarPosicion(vector1, posicion);
			System.err.println("Quiers continuar S/N");
			respuesta = tecladoScanner.next().charAt(0);
			respuesta = Character.toLowerCase(respuesta);
		} while (respuesta == 's');
		System.out.println("Fin del programa");
		tecladoScanner.close();
	}

	public static void rellenarArray(int[] array) {
		Random aleatorio = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = aleatorio.nextInt(100);
		}
	}
	public static void visualizaarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
	public static void visualizarPosicion(int[] array, int n) {
//		int dato = 0;
//		for (int i = 0; i < array.length; i++) {
//			dato = array[n];
//		}
//		System.out.println("La posicion " + n + " del array es " + dato);
		System.out.println("La posicion " + n + " del array es " + array[n - 1]);
	}
}
