package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio3 {
//	Dada una cadena cad y un carácter car, verificar cuántas veces se repite el
// carácter car en la cadena cad, por ejemplo:
//   Entrada: cad = "casa blanca", car = 'a'
//	 Salida: El caracter 'a' se repite 4 veces
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una cadena ");
		String cadena = teclado.nextLine();
		System.out.println("Introduce un caracter ");
		///Formateo para que me coja el caracter en la posicion que yo le digo con el numero 
		char car = teclado.next().charAt(0);
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (car == letra) {
				contador++;
			}			
		}
		System.out.println("La cadena tiene el caracter " + car +" " + contador + " veces");

	}// main

}
