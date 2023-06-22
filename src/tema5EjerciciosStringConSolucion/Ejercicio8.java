package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio8 {
	// Pide al usuario que introduzca una frase por teclado e indica cuántos
	// espacios en blanco tiene

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String cadena;
		int contador = 0;
		System.out.println("Introduce una frase  ");
		cadena = teclado.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			char car = cadena.charAt(i);

			if (car == ' ') {
				contador++;
			}
		}
		System.out.println("La cadena tiene " + contador+ " espacios");

	}// main

}
