/*
 *Hacer un programa en Java que permita cargar un array de 15 elementos con números aleatorios entre 1 y 100 
  y permita borrar de la lista un elemento que ocupa una determinada posición, que se introducirá por teclado, 
  desplazando todos los demás. Realizar el programa mediante métodos que resuelvan cada uno de los procesos
 */
package tema5EjerciciosArraysUnidimensionales;
import java.util.*;

public class Ejercicio7profe {
	private static int conteliminados = 0;

	public static void main(String[] args) {
		char res;
		int[] array = new int[15];
		int pos;
		Scanner teclado;
		teclado = new Scanner(System.in);
		cargarArray(array);
		visualizarArray(array);
		do {
			System.out.print("Introduce la posicion a borrar (entre 0 y 14 ): ");
			pos = teclado.nextInt();
			while (pos < 0 || pos > 14) {
				System.out.println("Error esa posici�n no existe, introduce la posicion a visualizar: (entre 0 y 14 )");
				pos = teclado.nextInt();
			}
			borrarElemento(array, pos);
			visualizarArray(array);
			System.out.println("Quieres continuar (S/N)");
			res = teclado.next().charAt(0);
			res = Character.toLowerCase(res);
		} while (res == 's');
		System.out.println("Fin Programa");
		teclado.close();
	}

	public static void cargarArray(int[] array1) {
		int aleatorio;
		for (int i = 0; i < 15; i++) {
			aleatorio = numeroAleatorio();
			array1[i] = aleatorio;
		}

	}

	public static int numeroAleatorio() {
		int Aleatorio;
		Random Aleatorio2 = new Random();
		Aleatorio = Aleatorio2.nextInt(100) + 1;
		return Aleatorio;
	}

	public static void visualizarArray(int[] array1) {

		for (int i = 0; i < array1.length; i++) {

			System.out.print(array1[i] + " ");

		}
		System.out.println();
	}

	public static void borrarElemento(int[] array1, int elem) {

		for (int i = elem; i < array1.length - 1; i++) {

			array1[i] = array1[i + 1];

		}
		array1[array1.length - 1] = 0;

	}

}
