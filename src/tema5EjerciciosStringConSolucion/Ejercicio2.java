package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio2 {
//	Dada una cadena, invertir la misma y mostrar por pantalla. Ejemplo:
//		Entrada: "casa blanca"
//		Salida: "acnalb asac"
	public static void main(String[] args) {

		System.out.println("Introduce una cadena ");
		Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
		String cadenareves = "";

		for (int j = cadena.length() - 1; j >= 0; j--) {
			cadenareves += cadena.charAt(j);
		}

		System.out.print(cadenareves);
		// System.out.println("La cadena al reves es " + cadenareves);

	}// main

}
