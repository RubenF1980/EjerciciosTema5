package tema5EjerciciosArraysUnidimensionales;

import java.util.Random;
import java.util.Scanner;

/*
	Ejercicio 7
	Hacer un programa en Java que permita cargar un array de 15 
	elementos con números aleatorios entre 1 y 100 y permita borrar 
	de la lista un elemento que ocupa una determinada posición, 
	que se introducirá por teclado, desplazando todos los demás 
	al principio del array y añadiendo ceros al final del array.
	Realizar el programa mediante métodos que resuelvan cada uno de los procesos.
	*/
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int posicion = 0;
		char res;
		int[] array = new int[10];
		rellenarArray(array);
		imprimir(array);
		do {
			System.out.println("\nIntroduce posicion a eliminar");
			posicion = teclado.nextInt();
			while (posicion < 0 || posicion > 14) {
				System.out.println("\nTiene que estar dentro del array.Introduce de nuevo");
				posicion = teclado.nextInt();
			}
			eliminarposicion(array, posicion);
			imprimir(array);
			System.out.println("\nQuieres continuar");
			res = teclado.next().charAt(0);
			res = Character.toLowerCase(res);
		} while (res == 's');
		System.out.println("fin de programa");
		teclado.close();

	}

	public static void rellenarArray(int array[]) {
		int ale = 0;
		for (int i = 0; i < array.length; i++) {
			ale = aleatorio();
			array[i] = ale;
		}
	}

	public static int aleatorio() {
		int aleatorioaux;
		Random aleatorio;
		aleatorio = new Random();
		aleatorioaux = aleatorio.nextInt(100) + 1;
		return aleatorioaux;
	}

	public static void imprimir(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

	public static void eliminarposicion(int array2[], int posi) {
		for (int i = posi; i < array2.length - 1; i++) {
			array2[i] = array2[i + 1];
		}
		array2[array2.length - 1] = 0;

	}

}
