package tema5EjerciciosArraysUnidimensionales;

import java.util.Random;
import java.util.Scanner;

//Hacer un programa en Java que rellene un array de 20 elementos de forma 
//aleatoria con números entre 0 y 100 y luego lo visualice.
//Realizar el programa mediante un método rellenarArray que a su vez
//llamará al método random, que se encargará de generar el número aleatorio.
//Visualizar el contenido del Array en el método main.

public class Ejercicio3 {
//Con este lo hago todo en un metodo ,pero el enunciado dice que tiene que tener un metodo random
//	public static void rellena(int array[]) {
////		 * Llamamos al m�todo random, que se encargar� de generar un n�mero entre 0 y100
////		 * y el n�mero se guardar� en la posici�n i, que determine el for utilizado
//		/*
//		 * nextInt(int n) Devuelve un pseudoaleatorio de tipo int comprendido entre cero
//		 * (incluido) y el valor especificado (excluido).
//		 */
//		for (int i = 0; i < array.length; i++) {
//			Random aleatorio = new Random();
//			int numero = aleatorio.nextInt(100);
//			array[i]= numero;
//			
//		}
//	}
	public static void rellenarArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			/*
			 * Llamamos al m�todo random, que se encargar� de generar un n�mero entre 0 y100
			 * y el n�mero se guardar� en la posici�n i, que determine el for utilizado
			 */
			a[i] = random();
		}
	}

	public static int random() {
		int numero;
		Random rand = new Random();
		numero = rand.nextInt(101);
		/*
		 * nextInt(int n) Devuelve un pseudoaleatorio de tipo int comprendido entre cero
		 * (incluido) y el valor especificado (excluido).
		 */
		return numero;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] arraynum1 = new int[20];
	
		rellenarArray(arraynum1);
		for (int i = 0; i < arraynum1.length; i++) {
			System.out.print(arraynum1[i]+ " ");
		}
		
		//System.out.println(arraynum1[i]);
		
	}

}
