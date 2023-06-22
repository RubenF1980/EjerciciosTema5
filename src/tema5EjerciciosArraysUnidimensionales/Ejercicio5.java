package tema5EjerciciosArraysUnidimensionales;

import java.util.Random;

/*
Hacer un programa en Java que simule el lanzamiento de una
 moneda 10 veces y contabilice el número de veces que salió cada cara utilizando un array. 
Realizar el programa mediante métodos. 
*/
public class Ejercicio5 {

	public static void main(String[] args) {

		int[] moneda = new int[10];
		tirarmoneda(moneda);
		visualizaycuenta(moneda);
	}

	public static void tirarmoneda(int[] array) {
		Random aleatorio = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = aleatorio.nextInt();
		}
	}

	public static void visualizaycuenta(int[] array) {
		int contaCara = 0;
		int contaCruz = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.println(array[i] + " cara ");
				contaCara++;
			} else {
				System.out.println(array[i] + " cruz");
				contaCruz++;
			}
		}
		System.out.print("Salieron " + contaCara + " veces cara y " + contaCruz + " veces cruz");

	}
}
