package tema5EjerciciosStringConSolucion;

import java.util.Scanner;

public class Ejercicio9 {
//	Escribir un programa que pida el nombre y apellidos del usuario
//	y lo muestre sin vocales (mayúsculas, minúsculas y acentuadas). 
//	Por ejemplo: Esteban Álvarez mostrará: stbn lvrz

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String cadena;
		String cadenasinvocale = "";
		

		System.out.println("Introduce nombre y apellidos  ");
		cadena = teclado.nextLine();
		String cadenaminusculas = cadena.toLowerCase();

		for (int i = 0; i < cadena.length(); i++) {
			char car = cadenaminusculas.charAt(i);
			if (car != 'a' && car != 'e' && car != 'i' && car != 'o' && car != 'u'&&
			    car != 'á' && car != 'é' && car != 'í' && car != 'ó' && car != 'ú') {
				cadenasinvocale += cadena.charAt(i);
			}
		} // for
		System.out.println(cadenasinvocale);

	}// main

}
