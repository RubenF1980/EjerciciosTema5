package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio1 {
//	Dada una cadena, mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
//		Entrada: cad = "Hola"
//		Salida: La cantidad de vocales es 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce una cadena ");
		Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
		int contadorvocales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			// System.out.println(letra);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contadorvocales++;
			}
		}
		System.out.println("La cadena tiene " + contadorvocales + " vocales");

	}// main

}
