package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio_12 {
//	Realiza el juego del ahorcado. Las reglas del juego son:
//	a) El jugador A teclea una palabra sin que el jugador B la vea
//	b) A continuación, se muestran tantos guiones como letras tenga la palabra secreta. Por ejemplo, para “hola” se muestra “_ _ _ _”.
//	c) El jugador B intentará acertar letra a letra la palabra secreta
//	d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas como guiones. Según el ejemplo anterior, si el jugador B introduce las letras: ‘o’, ‘j’ y ‘a, se muestra: “_o_a”
//	e) El jugador B tiene 7 intentos para adivinar la palabra
//	f) La partida termina cuando el jugador adivine la palabra (gana el jugador B) o se le agoten los intentos (gana el jugador A)
//	g) Mostrar un mensaje que indique quién es el ganador
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int NUM_INTENTOS = 7; // Constante con el número de intentos permitidos
		String palabraSecreta = "";
		String palabraAux = "";
		int intentos = 0;
		boolean acerte = false;
		char letra;
		// Solicitar al Jugador A la palabra a acertar
		System.out.print("Introduzca la palabra a acertar: ");
		palabraSecreta = sc.nextLine();
		// Mostrar los _ _ correspondientes a la palabra a acertar
		for (int i = 0; i < palabraSecreta.length(); i++)
			palabraAux += "_";
		System.out.print("\nPalabra a acertar: " + palabraAux);
		// Mientras que no se supere el número de intentos permitidos
		// y no se acierte la palabra
		while ((intentos < NUM_INTENTOS) && (!acerte)) {
			// Solicitar una letra al Jugador B
			System.out.print("\nIntroduzca la letra a buscar en la palabra: ");
			letra = sc.next().charAt(0);
			// Recorrer el array y mostrar la letra donde aparezca en la palabra
			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (i == 0 && palabraSecreta.charAt(i) == letra)
					palabraAux = letra + palabraAux.substring(1);
				else if (palabraSecreta.charAt(i) == letra)
					palabraAux = palabraAux.substring(0, i) + letra + palabraAux.substring(i + 1);
				if (i == palabraSecreta.length() - 1)
					System.out.println("\n" + palabraAux);
			}
			if (palabraSecreta.equals(palabraAux)) // Si ya ha acertado la palabra
			{
				System.out.print("¡¡¡ Felicidades, has acertado !!!");
				acerte = true;
			}
			intentos++;
		}
		if (intentos == NUM_INTENTOS) // Si se superó el número de intentos
			System.out.print("¡¡¡ Lo lamento, has superado el número de intentos !!!");
	}
}
