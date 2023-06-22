package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio7 {
//	Introducir por teclado dos palabras e indicar cuál de ella es la más corta,
//	es decir, la que contiene menos caracteres

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String cadena1,cadena2;
		System.out.println("Introduce una palabra  ");
		cadena1 = teclado.nextLine();
		System.out.println("Introduce una palabra  ");
		cadena2 = teclado.nextLine();
		
		if (cadena1.length()<cadena2.length()) {
			System.out.println("Es mas corta la palabra"+ cadena1);
			
		} else if (cadena1.length()==cadena2.length()) {
			System.out.println("Son igul de largas");
		}else {
			System.out.println("Es mas corta la palabra"+ cadena2);
		
		}

	}// main

}
