package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio6 {
//	Pide al usuario que introduzca un número y diga si es capicúa
//	(si se lee igual de derecha a izquierda que de izquierda a derecha, 
//	como el 12321). (pista: será interesante leer el número como cadena de texto).

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una numero para saber si es capicua  ");
		String cadena = teclado.nextLine();
		//String cadReves = "";

		// Solución 1. Invertir y comparar si son iguales
//		for (int j = cadena.length() - 1; j >= 0; j--) {
//			cadReves += cadena.charAt(j);
//		}
//		// comparo una con otra
//		if (cadena.equalsIgnoreCase(cadReves)) {
//			System.out.print("La cadena " + cadena + " es igual que la cadena " + cadReves);
//		} else {
//			System.out.println("La cadena " + cadena + " no es igual que la cadena " + cadReves);
//		}

		// Solución 2. Comparar el primer dígito con el último,
		// el segundo con el antepenúltimo, etc.
		boolean capicua = true;
		for (int i = 0; i < (cadena.length() / 2); i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length() - i - 1)) {
				capicua = false;
			}
		}
		if (capicua) {
			System.out.println("Capicúa");
		} else {
			System.out.println("No es capicua");
		}

	}// main

}
