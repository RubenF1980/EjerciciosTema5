package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio5 {
//	Pide al usuario que introduzca una frase y cambie los espacios por guiones
//	(por ejemplo: "como estas, Juan" -> "como-estas,-Juan").
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una frase ");
		String cadena = teclado.nextLine();

		//con un bucle 
//		for (int i = 0; i < cadena.length(); i++) {
//			char car = cadena.charAt(i);
//			if (car == ' ') {
//				car = '-';
//			}
//			System.out.print(car);
//		}
		
		//Abreviado 
		cadena= cadena.replace(' ', '-');
		System.out.print(cadena);

	}// main

}
