package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio_11 {
//	Diseñar el juego “Acierta la contraseña”. El primer jugador introduce la 
//	contraseña y el segundo debe teclear palabras hasta que la adivine.
//	Si el segundo jugador no acierta, se le dará una pista indicando si la 
//	palabra introducida es mayor o menor alfabéticamente que la contraseña.

//	Modifica el ejercicio anterior. Ahora la pista es la siguiente: se mostrará una cadena 
//  con los caracteres acertados y con * en los no acertados.
//	Ejemplo: Si la contraseña es “contraseña” y el usuario teclea “contrato” se muestra: contra****

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

			if (contrasena.equals(adivina)) {
				System.out.println("Has acertado");
				acierto = true;
			} else
				for (int i = 0; i < contrasena.length(); i++)
					if (i < adivina.length())
						if (contrasena.charAt(i) == adivina.charAt(i))
							System.out.print(contrasena.charAt(i));
						else
							System.out.print("*");
					else
						System.out.print("*");
		}
	}

	
}
