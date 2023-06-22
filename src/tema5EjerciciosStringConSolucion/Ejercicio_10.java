package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio_10 {
//	Diseñar el juego “Acierta la contraseña”. El primer jugador introduce la 
//	contraseña y el segundo debe teclear palabras hasta que la adivine.
//	Si el segundo jugador no acierta, se le dará una pista indicando si la 
//	palabra introducida es mayor o menor alfabéticamente que la contraseña.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String contrasena = "";
		String adivina = "";
		boolean acierto = false;

		System.out.println("Introduce la contraseña  ");
		contrasena = teclado.nextLine();

		while (!acierto) {// Mientras que no acierte la contraseña
			
			System.out.println("Introduce a ver si adivinas");
			adivina = teclado.nextLine();

			if (contrasena.compareToIgnoreCase(adivina) == 0) {
				System.out.println("Has acertado ");
				acierto = true;
			} else if (contrasena.compareToIgnoreCase(adivina) < 1)
				System.out.println("es menor");
			else
				System.out.println("es mayor");
		}

	}// main

}
